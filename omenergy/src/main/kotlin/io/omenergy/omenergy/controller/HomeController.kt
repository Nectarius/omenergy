package io.omenergy.omenergy.controller

import io.omenergy.omenergy.repository.InfoDataRepository
import io.omenergy.omenergy.service.TrainingDescriptionService
import io.omenergy.omenergy.service.VideoDataService
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HomeController(val trainingDescriptionService: TrainingDescriptionService, val videoDataService: VideoDataService, val infoDataRepository: InfoDataRepository) {

    @GetMapping("/")
    fun index(model: Model): String{
        val auth = SecurityContextHolder.getContext()?.authentication
        if (auth != null) {
            val principal = auth.principal
                //.attribute<String>("email") ?: "guest"
                // println("user : $principal")
            //println("user : $userEmail")
        }
        model.addAttribute("infoData", infoDataRepository.findFirst())
        model.addAttribute("services", trainingDescriptionService.getData())
        model.addAttribute("videos", videoDataService.freeAvailable())
        return "home/index"
    }

}
