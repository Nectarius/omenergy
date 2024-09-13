package io.omenergy.omenergy.controller

import io.omenergy.omenergy.dto.InfoDataDto
import io.omenergy.omenergy.dto.TrainingDescriptionDto
import io.omenergy.omenergy.entity.InfoData
import io.omenergy.omenergy.entity.TrainingDescriptionData
import io.omenergy.omenergy.repository.InfoDataRepository
import io.omenergy.omenergy.service.TrainingDescriptionService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/content/info-data")
class InfoDataController(val infoDataRepository: InfoDataRepository) {

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
    @GetMapping
    fun data() = mapToDto(infoDataRepository.findFirst())

    @GetMapping("/reset-to-default")
    fun reset() = infoDataRepository.resetToDefault()


    @PostMapping("/update")
    fun update(@RequestBody infoData: InfoDataDto) = infoDataRepository.update(infoData.header, infoData.description)

    fun mapToDto(data: InfoData) = InfoDataDto(
        id = data.id.toString(),
        header = data.header,
        description = data.description,
        aboutCourses = data.aboutCourses ?: "",
        coursesTitle = data.coursesTitle ?: ""
    )

}