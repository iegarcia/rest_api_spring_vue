<template>
  <div>
    <table>
      <tr>
        <th>Cuit</th>
        <th>Cuit_rep</th>
        <th>Domicilio</th>
        <th>Telefono</th>
        <th>Actividad</th>
        <th>Caracter</th>
        <th>Condicion</th>
      </tr>
      <tr v-for="register in registers">
        <td>{{ register.id }}</td>
        <td>{{ register.cuit_rep }}</td>
        <td>{{ register.domicilio }}</td>
        <td>{{ register.telefono ? register.telefono : "Sin datos" }}</td>
        <td>{{ register.actividad }}</td>
        <td>{{ register.caracter }}</td>
        <td>{{ register.condicion }}</td>
      </tr>
    </table>
  </div>
</template>

<script setup>
import { getData } from "@/functions";
</script>

<script>
export default {
  data() {
    return {
      name: "Home",
      registers: [],
    };
  },
  methods: {
    async getRegisters() {
      try {
        const registers = await getData();
        this.registers = registers;
      } catch (error) {
        alert("Ocurrio un error. Revisa la consola :)");
        console.error(error);
      }
    },
  },
  mounted() {
    this.getRegisters();
  },
};
</script>

<style>
table {
  border-collapse: collapse;
}
th,
td {
  border: 1px solid black;
  padding: 8px;
  text-align: left;
}
th {
  font-weight: 700;
  color: black;
}
tr {
  color: black;
}
</style>
