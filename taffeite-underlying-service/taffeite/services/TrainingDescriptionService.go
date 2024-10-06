package services

import (
	"taffeite.com/taffeite-underlying-service/dto"
)

func GetTrainingDescriptions() []dto.TrainingDescriptionDto {

	return []dto.TrainingDescriptionDto{
		{"Убрать лишний вес",
			"Сбросить лишний вес и наладить питание для постоянной энергии",
			"assets/images/icons/guru-blue.png"},
		{"Раскрыть женскую сексуальность",
			"Вернуть страсть и взаимоотношения с своим партнером",
			"assets/images/icons/guru-blue.png"},

		{"Научиться танцевать",
			" Онлайн-занятия. Эффективные тренировки дома даже для самых ленивых",
			"assets/images/icons/guru-blue.png"},
	}
}
