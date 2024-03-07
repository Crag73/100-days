import { PrismaClient } from "@prisma/client";
const prisma=new PrismaClient();
import express from "express";
const router=express.Router();
import { verifyToken } from "../utils/auth";


router.post("/",verifyToken,async (req,res)=>{
    const {title,content}=req.body;
    const userId=req.user.id;
    let tweet=await prisma.tweet.create({
        data:{
            title:title,
            content:content,
            userId:userId
        }
    })
    res.send({tweet});
})

router.get("/",(req,res)=>{

})

router.delete("/:id",(req,res)=>{

})

router.put("/:id",(req,res)=>{

})

router.get("/:id",(req,res)=>{

})

export default router;