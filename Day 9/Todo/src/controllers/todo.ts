import { PrismaClient } from "@prisma/client"

const prisma= new PrismaClient;

async function createTodo(todoDesc:string) {
    const Todo= await prisma.toDo.create({
        data:{
            desc:todoDesc
        },
    });
    return Todo;
}

module.exports = { createTodo }