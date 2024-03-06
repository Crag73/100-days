import { PrismaClient } from "@prisma/client";
import express from "express";
import { verifyToken } from "../utils/auth";
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
router.get("/",async(req,res)=>{
    let users=await prisma.user.findMany();
    res.send({users});
})
router.get("/:id",async(req,res)=>{
    const {id} = req.body;
    let user=await prisma.user.findUnique({
        where:{
            id:id
        }
    })
    res.send({user});
})
router.get("/:username",async(req,res)=>{
    const {username} = req.body;
    let users=await prisma.user.findMany({
        where:{
            OR:[
            {
                firstName:{
                    contains:username
                },
                lastName:{
                    contains:username
                }
                }
            ]
        }
    })
    console.log({users});
})
router.delete("/:id",verifyToken,async(req,res)=>{
    const {id} = req.body;
    if(id!=req.user.id) return res.send("not a valid request");
    let result= await prisma.user.delete({
        where:{
            id
            }
    })
    res.send("user deleted");
    console.log(result);
})
router.put("/:id",verifyToken,(req,res)=>{
    
})

export default router;