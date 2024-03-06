import express from "express";
import dotenv from 'dotenv';
import userRoute from "./routes/user";
import loginRoute from "./routes/login";
import tweetRoute from "./routes/tweet";
import cookieParser = require("cookie-parser");
dotenv.config();
const app=express();
app.use(express.json());
app.use(cookieParser());
const PORT =process.env.PORT || 2000;

app.get("/",(req,res)=>{
    res.send("<h1>Twitter Clone</h1>")
})


//routes
app.use("/user",userRoute);
app.use("/login",loginRoute);
app.use("/tweets",tweetRoute);

app.listen(PORT, ()=>{
    console.log(`Server started on port: ${PORT}`);
})