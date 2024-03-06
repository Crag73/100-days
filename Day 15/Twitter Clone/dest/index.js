"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = __importDefault(require("express"));
const dotenv_1 = __importDefault(require("dotenv"));
const user_1 = __importDefault(require("./routes/user"));
const login_1 = __importDefault(require("./routes/login"));
const tweet_1 = __importDefault(require("./routes/tweet"));
const cookieParser = require("cookie-parser");
dotenv_1.default.config();
const app = (0, express_1.default)();
app.use(express_1.default.json());
app.use(cookieParser());
const PORT = process.env.PORT || 2000;
app.get("/", (req, res) => {
    res.send("<h1>Twitter Clone</h1>");
});
//routes
app.use("/user", user_1.default);
app.use("/login", login_1.default);
app.use("/tweets", tweet_1.default);
app.listen(PORT, () => {
    console.log(`Server started on port: ${PORT}`);
});
