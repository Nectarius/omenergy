package io.omenergy.omenergy.service

import io.omenergy.omenergy.entity.VideoData
import org.springframework.stereotype.Service

@Service
class VideoDataService {

    /**
     *              <div class="col-md-4">
     * 					<div class="team text-center">
     * 						<div class="cover" style="background:url('images/team/team-cover3.jpg'); background-size:cover;">
     * 							<div class="overlay text-center">
     * 								<h3 class="white">$69.00</h3>
     * 								<h5 class="light light-white">1 - 5 sessions / month</h5>
     * 							</div>
     * 						</div>
     * 						<img src="images/team/team2.jpg" alt="Team Image" class="avatar">
     * 						<div class="title">
     * 							<h4>John Phillips</h4>
     * 							<h5 class="muted regular">Personal Trainer</h5>
     * 						</div>
     * 						<a href="#" data-toggle="modal" data-target="#modal1" class="btn btn-blue-fill ripple">Sign Up Now</a>
     * 					</div>
     * 				</div>
     */
    fun freeAvailable(): List<VideoData> {
        return listOf(
            VideoData(
                title = " Fake",
                description = "Personal Trainer",
                image = "images/team/team3.jpg",
                background = "background:url('images/team/team-cover1.jpg'); background-size:cover;",
                priceLabel = "\$69.00",
                priceDescription = "1 - 5 sessions / month",
                content =   ""
            ),
            VideoData(
                title = "Eva Williams Fake",
                description = "Personal Trainer",
                image = "images/team/team1.jpg",
                background = "background:url('images/team/team-cover2.jpg'); background-size:cover;\"",
                priceLabel = "\$69.00",
                priceDescription = "1 - 5 sessions / month",
                content =   ""
            ),
            VideoData(
                title = "John Phillips Fake",
                description = "Personal Trainer",
                image = "images/team/team2.jpg",
                background = "background:url('images/team/team-cover3.jpg'); background-size:cover;",
                priceLabel = "\$69.00",
                priceDescription = "1 - 5 sessions / month",
                content =   ""
            )
        )
    }
}