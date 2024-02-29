import {Express} from 'express'
const express=require('express');
const dotenv = require('dotenv');
const app:Express = express();
const {createTodo} = require('./controllers/todo');
dotenv.config();

const PORT=process.env.PORT;

app.use(express.json())


app.get("/",(req,res)=>{
    res.json({msg:"Home Page"})
})

app.post("/todo",async (req,res)=>{
    try {
        const {desc} = req.body
        const newTodo= await createTodo(desc)
        res.json({msg: "Todo Created",success:true})
    } catch (err) {
        res.json({err});
        console.log(err);
    }
})

app.get("/todo",async (req,res)=>{
    try {

    } catch (err) {
        res.json({err});
    }
})



app.listen(PORT, ()=>{
    console.log("Server running at port "+PORT)
})