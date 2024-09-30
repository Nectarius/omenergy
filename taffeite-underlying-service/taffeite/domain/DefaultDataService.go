package entity

import (
	"go.mongodb.org/mongo-driver/bson/primitive"
)

func GetDefaultPanelViewData() PanelViewData {
	var infoData = InfoData{}
	infoData.Header = "Здравствуйте меня зовут Ольга Молодцова"
	infoData.Description = "Хореограф/Тренер и балерина. Преподаватель балета и латиноамериканских танцев более 12 лет. Автор и преподаватель курса 'Постройней за 30 дней'. Более 1500 довольных клиентов обучила растяжке, красивой осанке и женственности."
	infoData.AboutCourses = "1. Убрать лишний вес\n2. Раскрыть женскую сексуальность\n3. Научиться танцевать\n4. Победить депрессию и апатию\n5. Эффективные тренировки без спортзала\n6. Понять своё предназначение и "
	infoData.CoursesTitle = "Зачем Вы здесь ?"
	return PanelViewData{
		Id:      primitive.NewObjectID(),
		Version: 0,
		NavigationInfo: NavigationInfoData{
			Intro:          "О нас",
			AboutTrainings: "О моих занятиях",
			Pricing:        "Прайсинг",
		},
		Info: infoData,
		Services: []TrainingDescriptionData{
			{"Убрать лишний вес",
				"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
				"assets/images/icons/guru-blue.png"},
			{"Раскрыть женскую сексуальность",
				"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
				"assets/images/icons/guru-blue.png"},

			{"Научиться танцевать",
				"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
				"assets/images/icons/guru-blue.png"},
			{"Эффективные тренировки без спортзала",
				"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
				"assets/images/icons/guru-blue.png"},
			{"Победить депрессию и апатию",
				"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
				"assets/images/icons/guru-blue.png"},

			{"Стать богатым, спокойным и знаменитым",
				"A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
				"assets/images/icons/guru-blue.png"},
		},
	}
}
