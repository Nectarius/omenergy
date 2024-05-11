package io.omenergy.omenergy.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class AuthController {

    /**
     * ...
     */
    @GetMapping("/user")
    fun user(@AuthenticationPrincipal principal: OAuth2User): Map<String, Any?> {
        return Collections.singletonMap("name", principal.getAttribute("name"))
    }

    @GetMapping("/error")
    fun error(request: HttpServletRequest): String {
        val message = request.session.getAttribute("error.message") as String
        request.session.removeAttribute("error.message")
        return message
    }
}