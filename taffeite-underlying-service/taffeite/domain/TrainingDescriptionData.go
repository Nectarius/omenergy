package entity

import "go.mongodb.org/mongo-driver/bson/primitive"

type TrainingDescriptionData struct {
	Id          primitive.ObjectID
	Header      string
	Description string
	Image       string
}
