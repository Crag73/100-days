import { PrismaClient } from "@prisma/client";
const prisma=new PrismaClient();
import express from "express";
const router=express.Router();
import { createJwtToken } from "../utils/auth";

router.post("/",async (req,res)=>{
    const {email,password} = req.body;
    let user=await prisma.user.findUnique({
        where:{
            email:email
        }
    })
    if(!user){
        throw new Error("Invalid email")
    }
    if(user.password!=password){
        throw new Error("Invalid password")
    }
    let token=createJwtToken(user);
    res.cookie("token",token);
    res.redirect("/");
})



export default router;