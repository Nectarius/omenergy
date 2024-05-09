package io.omenergy.omenergy

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import java.util.*


@Controller
class HomeController {

    @GetMapping("/")
    fun index(): String = "home/index"



}
