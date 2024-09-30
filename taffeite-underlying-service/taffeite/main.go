package main

import (
	"github.com/gin-gonic/gin"
	"golang.org/x/net/context"
	"html/template"
	"taffeite.com/taffeite-underlying-service/access"
	"taffeite.com/taffeite-underlying-service/conf"
	"taffeite.com/taffeite-underlying-service/services"
)

func main() {
	// Create a new Gin router
	router := gin.Default()

	var controllerConf = conf.NewControllerConf()

	// Load the HTML template
	tmpl, err := template.ParseFiles(controllerConf.HomePageUrl)
	if err != nil {
		panic(err)
	}
	var taffeiteModule = access.NewTaffeiteModule()

	// var infoData = services.GetDefaultInfoData()
	var infoData = services.ConvertToDto(taffeiteModule.PanelViewRepository.GetPanelViewData())

	// Define a handler function
	router.GET("/", func(c *gin.Context) {
		// Create a data structure to pass to the template

		var panelView = infoData
		// Render the template with the data
		err := tmpl.Execute(c.Writer, panelView)
		if err != nil {
			panic(err)
		}
	})

	router.Static("/assets", "assets")

	defer func(module *access.TaffeiteModule, ctx context.Context) {
		module.Clear()
	}(taffeiteModule, context.Background())

	// Start the HTTP server
	router.Run(":2560")
}
