package services

import "taffeite.com/taffeite-underlying-service/dto"

func GetTrainingDescriptions() []dto.TrainingDescriptionDto {

	return []dto.TrainingDescriptionDto{
		{"1", "Убрать лишний вес",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"assets/images/icons/guru-blue.png"},
		{"2", "Раскрыть женскую сексуальность",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"assets/images/icons/guru-blue.png"},

		{"3", "Научиться танцевать",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"assets/images/icons/guru-blue.png"},
		{"4", "Эффективные тренировки без спортзала",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"assets/images/icons/guru-blue.png"},
		{"5", "Победить депрессию и апатию",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"assets/images/icons/guru-blue.png"},

		{"6", "Стать богатым, спокойным и знаменитым",
			"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
			"assets/images/icons/guru-blue.png"},
	}
}
