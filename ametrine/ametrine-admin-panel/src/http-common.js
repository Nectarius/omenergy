import axios from "axios";

export default axios.create({
  baseURL: "http://localhost:8080/content",
  headers: {
    "Content-type": "application/json",
    'Access-Control-Allow-Origin': 'http://localhost:5173'
  }

});
