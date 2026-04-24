const express = require("express");
const userRoutes = require("./routes/UserRoutes");

const app = express();
app.use(express.json());
app.use("/api", userRoutes);

app.listen(3000, () => console.log("Servidor rodando na porta 3000"));