import http from "../http-common";

class TrainingDescriptionDataService {

  getAll() {
    return http.get("/training-description");
  }

  get(id) {
    return http.get(`/training-description/${id}`);
  }

  create(data) {
    return http.post("/training-description/save", data);
  }

  update(data) {
    return http.post("/training-description/update", data);
  }

  delete(id) {
    return http.delete(`/training-description/${id}`);
  }

  deleteAll() {
    return http.delete(`/training-description`);
  }

  findByHeader(header) {
    return http.get(`/training-description/by-header?header=${header}`);
  }
}

export default new TrainingDescriptionDataService();
