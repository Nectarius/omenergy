package io.omenergy.omenergy.entity

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
data class VideoData(val title: String, val description: String, val image: String, val background: String, val priceLabel: String, val content: String)
