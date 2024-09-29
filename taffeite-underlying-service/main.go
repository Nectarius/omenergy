package main

import (
	"github.com/gin-gonic/gin"
	"html/template"
	"taffeite.com/taffeite-underlying-service/dto"
	"taffeite.com/taffeite-underlying-service/services"
)

func main() {
	// Create a new Gin router
	router := gin.Default()

	// Load the HTML template
	tmpl, err := template.ParseFiles("resources/template/index.html")
	if err != nil {
		panic(err)
	}
	//http.Handle("/assets/", http.StripPrefix("/assets/", http.FileServer(http.Dir("./assets"))))

	// Define a handler function
	router.GET("/", func(c *gin.Context) {
		// Create a data structure to pass to the template
		var infoData = services.GetDefaultInfoData()
		var panelView = dto.PanelView{
			NavigationInfo: dto.NavigationInfoDto{
				Intro:          "О нас",
				AboutTrainings: "О моих занятиях",
				Pricing:        "Прайсинг",
			},
			InfoDataSet: infoData,
			Services:    services.GetTrainingDescriptions(),
		}
		// Render the template with the data
		err := tmpl.Execute(c.Writer, panelView)
		if err != nil {
			panic(err)
		}
	})

	router.Static("/assets", "assets")

	// Start the HTTP server
	router.Run(":8080")
}
