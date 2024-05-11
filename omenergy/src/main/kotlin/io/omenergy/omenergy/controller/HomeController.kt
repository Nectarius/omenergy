package io.omenergy.omenergy.controller

import io.omenergy.omenergy.service.TrainingDescriptionService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HomeController(val trainingDescriptionService: TrainingDescriptionService) {

    @GetMapping("/")
    fun index( model: Model): String{
        model.addAttribute("services", trainingDescriptionService.data());
        return "home/index"
    }



}
