package access

import (
	"taffeite.com/taffeite-underlying-service/conf"
	"taffeite.com/taffeite-underlying-service/repository"
)

type TaffeiteModule struct {
	InfoDataRepository repository.InfoDataRepository
	MongoConf          *conf.MongoConf
}

func NewTaffeiteModule() *TaffeiteModule {
	var mongoConf = conf.NewMongoConf()
	var infoDataRepository = repository.InfoDataRepository{Conf: *mongoConf}
	return &TaffeiteModule{InfoDataRepository: infoDataRepository, MongoConf: mongoConf}
}

func (tf *TaffeiteModule) Clear() {
	tf.MongoConf.Clear()
	//fmt.Println("Clear TaffeiteModule")
}
