package io.omenergy.omenergy.controller

import io.omenergy.omenergy.entity.VideoData
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/video")
class VideoDataController {

    @GetMapping("/free-available")
    fun freeAvailable(): List<VideoData> {
        return listOf(
            VideoData(
                title = "John Phillips",
                description = "Personal Trainer",
                image = "images/team/team2.jpg",
                background = "images/team/team-cover3.jpg",
                priceLabel = "free",
                content = "test"
            )
        )
    }

    @GetMapping("/private")
    fun private(@AuthenticationPrincipal principal: OAuth2User?): List<VideoData> {
        if(principal == null){
            return emptyList()
        }
        val userEmail = principal.getAttribute<String>("email") ?: return emptyList()
        // request to database
         return listOf(
            VideoData(
                title = "John Phillips",
                description = "Personal Trainer",
                image = "images/team/team2.jpg",
                background = "images/team/team-cover3.jpg",
                priceLabel = "\$69.00",
                content = userEmail.toString(),
            )
        )
    }

}