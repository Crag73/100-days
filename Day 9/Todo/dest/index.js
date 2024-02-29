"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
const express = require('express');
const dotenv = require('dotenv');
const app = express();
const { createTodo } = require('./controllers/todo');
dotenv.config();
const PORT = process.env.PORT;
app.use(express.json());
app.get("/", (req, res) => {
    res.json({ msg: "Home Page" });
});
app.post("/todo", (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
        const { desc } = req.body;
        const newTodo = yield createTodo(desc);
        res.json({ msg: "Todo Created", success: true });
    }
    catch (err) {
        res.json({ err });
        console.log(err);
    }
}));
app.get("/todo", (req, res) => __awaiter(void 0, void 0, void 0, function* () {
    try {
    }
    catch (err) {
        res.json({ err });
    }
}));
app.listen(PORT, () => {
    console.log("Server running at port " + PORT);
});
