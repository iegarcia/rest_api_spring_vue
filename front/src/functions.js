import axios from "axios";

export async function getData() {
  const response = await axios.get(`http://localhost:8080/api/domicilio`);

  return parseData(response.data);
}

function parseData(data) {
  const json = [];

  data.forEach(function (item) {
    var obj = {
      id: item[0],
      cuit: item[1],
      cuit_rep: item[2],
      domicilio: item[3],
      telefono: item[4],
      actividad: item[5],
      condicion: item[6],
      caracter: item[7],
    };
    json.push(obj);
  });
  return json;
}
