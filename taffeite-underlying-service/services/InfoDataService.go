package services

import "taffeite.com/taffeite-underlying-service/dto"

func GetDefaultInfoData() dto.InfoDataDto {

	return dto.InfoDataDto{
		Header:       "Здравствуйте меня зовут Ольга Молодцова",
		Description:  "Хореограф/Тренер и балерина. Преподаватель балета и латиноамериканских танцев более 12 лет. Автор и преподаватель курса 'Постройней за 30 дней'. Более 1500 довольных клиентов обучила растяжке, красивой осанке и этикету.",
		AboutCourses: "О моих занятиях",
		CoursesTitle: "о занятиях",
	}

}
