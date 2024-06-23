package io.omenergy.omenergy.controller

import io.omenergy.omenergy.entity.TrainingDescriptionData
import io.omenergy.omenergy.service.TrainingDescriptionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/training-description")
class TrainingDescriptionController(val trainingDescriptionService: TrainingDescriptionService) {

    /**
     * <div class="col-md-4">
     * 					<div class="service">
     * 						<div class="icon-holder">
     * 							<img src="images/icons/heart-blue.png" alt="" class="icon">
     * 						</div>
     * 						<h4 class="heading">Cardio Training</h4>
     * 						<p class="description">A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.</p>
     * 					</div>
     * 				</div>
     */
    @GetMapping("/data")
    fun data() = trainingDescriptionService.getData()

    @PostMapping("/data")
    fun data(@RequestBody trainingDescriptionData: TrainingDescriptionData) = trainingDescriptionService.save(trainingDescriptionData)

    @PostMapping("/reset-to-default")
    fun resetToDefaults() = trainingDescriptionService.resetToDefault()
}