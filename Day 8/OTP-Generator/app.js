const express = require('express');
const app = express();
const mongoose = require("mongoose");
const PORT = process.env.PORT;
const path = require("path");
const uri = process.env.URI;
app.use(express.static(path.join(__dirname, "static")))
app.use(express.urlencoded({ extended: true }))
app.use(express.json())


mongoose.connect(uri)
    .then(() => app.listen(PORT, () => {
        console.log("server started at port " + PORT);
    }))
