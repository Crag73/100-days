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

router.get("/",async(req,res)=>{
    const {title,content}=req.body;
    const result=await prisma.tweet.findMany({
        where:{
            OR:[
                {
                    title:{
                        contains:title
                    },
                    content:{
                        contains:content
                    }
                }
            ]
        }
    })
    res.send(result);
})

router.delete("/:id",verifyToken,async (req,res)=>{
    const id=Number(req.params.id);
    await prisma.tweet.delete({
        where:{
            id:id
        }
    })
    res.send("Successfully Deleted");
})

router.put("/:id",verifyToken,async (req,res)=>{
    const id=Number(req.params.id);
    const {title,content}=req.body;
    await prisma.tweet.update({
        where:{
            id:id
        },
        data:{
            title:title,
            content:content
        }
    })
})

router.get("/:id",async (req,res)=>{
    const id=Number(req.params.id);
    const tweet=await prisma.tweet.findUnique({
        where:{
            id:id
        }
    })
    res.send(tweet);
})

export default router;