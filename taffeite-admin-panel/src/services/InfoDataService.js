import http from "../http-common";

class InfoDataService {

  get() {
    return http.get("/info-data");
  }

  update(data) {
    return http.post("/info-data/update", data);
  }

}

export default new InfoDataService();
