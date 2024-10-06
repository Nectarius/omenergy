docker build -t taffeite .

docker run -p 2560:2560 taffeite
docker run -p 2560:2560 --rm -ti taffeite

docker build -t taffeite -f Dockerfile ./taffeite
