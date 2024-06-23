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

  update(id, data) {
    return http.put(`/training-description/${id}`, data);
  }

  delete(id) {
    return http.delete(`/training-description/${id}`);
  }

  deleteAll() {
    return http.delete(`/training-description`);
  }

  findByTitle(title) {
    return http.get(`/training-description?title=${title}`);
  }
}

export default new TrainingDescriptionDataService();
