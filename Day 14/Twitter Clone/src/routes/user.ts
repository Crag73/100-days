import { PrismaClient } from "@prisma/client";
import express from "express";
const router = express.Router();
const prisma=new PrismaClient();

router.post("/",async (req,res)=>{
    const {firstName,lastName,username,email,password} = req.body;
    let user=await prisma.user.create({
        data:{
            firstName,
            lastName,
            username,
            email,
            password
        }
    })
    res.send(user);
})






export default router;