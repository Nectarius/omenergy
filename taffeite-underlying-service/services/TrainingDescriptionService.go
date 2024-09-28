package services

import "taffeite.com/taffeite-underlying-service/dto"

func GetTrainingDescriptions() []dto.TrainingDescriptionDto {

	// return listOf(
	//            TrainingDescriptionDto(
	//                header = "Cardio Training . Fake data",
	//                description = "A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
	//                image = "images/icons/heart-blue.png"
	//            ),
	//            TrainingDescriptionData(
	//                header = "Yoga Pilates . Fake data",
	//                description = "A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
	//                image = "images/icons/guru-blue.png"
	//            ),
	//            TrainingDescriptionData(
	//                header = "Power Training . Fake data",
	//                description = "A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
	//                image = "images/icons/weight-blue.png"
	//            )
	//        )
	return []dto.TrainingDescriptionDto{
		{"1", "Cardio Training",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"images/icons/guru-blue.png"},
		{"1", "Cardio Training",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"images/icons/guru-blue.png"},

		{"1", "Cardio Training",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"images/icons/guru-blue.png"},
	}
}
