package io.omenergy.omenergy


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.ParameterizedTypeReference
import org.springframework.security.config.Customizer.withDefaults
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient
import org.springframework.security.oauth2.core.OAuth2AuthenticationException
import org.springframework.security.oauth2.core.OAuth2Error
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.server.SecurityWebFilterChain
import org.springframework.security.web.server.authentication.logout.DelegatingServerLogoutHandler
import org.springframework.security.web.server.authentication.logout.SecurityContextServerLogoutHandler
import org.springframework.security.web.server.authentication.logout.WebSessionServerLogoutHandler
import org.springframework.web.reactive.function.client.WebClient


@SpringBootApplication
class OmenergyApplication  {

    @Bean
    @Throws(Exception::class)
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
      return  http
            .authorizeHttpRequests { authz ->
                authz
                    .anyRequest().authenticated()
            }.oauth2Login(withDefaults()).logout(withDefaults()).build()
           

    }



    @Bean
    fun oauth2UserService(rest: WebClient): OAuth2UserService<OAuth2UserRequest, OAuth2User> {
        val delegate = DefaultOAuth2UserService()
        return OAuth2UserService<OAuth2UserRequest, OAuth2User> { request: OAuth2UserRequest ->
            val user = delegate.loadUser(request)
            if ("google" != request.clientRegistration.registrationId) {
                return@OAuth2UserService user
            }

            val client =
                OAuth2AuthorizedClient(request.clientRegistration, user.name, request.accessToken)
            val url = user.getAttribute<String>("organizations_url")
            val orgs = rest
                .get().uri(url!!)
                .attributes(oauth2AuthorizedClient(client))
                .retrieve()
                .bodyToMono<String>(String::class.java)
                .block()
         //   MutableList::class.java
            if (
               orgs != null
            ) {
                return@OAuth2UserService user
            }
            throw OAuth2AuthenticationException(OAuth2Error("invalid_token", "Not in Spring Team", ""))
        }
    }


    @Bean
    fun rest(clients: ClientRegistrationRepository?, authz: OAuth2AuthorizedClientRepository?): WebClient {
        val oauth2 =
            ServletOAuth2AuthorizedClientExchangeFilterFunction(clients, authz)
        return WebClient.builder()
            .filter(oauth2).build()
    }

    @Bean
    fun webSecurityCustomizer(): WebSecurityCustomizer {
        return WebSecurityCustomizer { web: WebSecurity -> web.ignoring().requestMatchers("/" , "/css/**",  "/js/**", "/images/**", "/fonts/**", "/error", "/webjars/**") }
    }
}

fun main(args: Array<String>) {
    runApplication<OmenergyApplication>(*args)
}
