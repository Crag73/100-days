import { PrismaClient, User } from '@prisma/client'
const prisma = new PrismaClient();

async function insertData(email:string,password:string,firstName?:string){
    let user=await prisma.user.create({
        data:{
            email,
            password,
            firstName
        }
    })
    console.log(user);
}


interface data{
    email:string,
    password:string,
    firstName?:string
}

let data1=[
    {
        email:"abc@gmail.com",
        password:"123",
        firstName:"xyz"
    },
    {
        email:"abcd@gmail.com",
        password:"1234",
        firstName:"xyza"
    },
    {
        email:"abcde@gmail.com",
        password:"12345",
        firstName:"xyzab"
    }
]

async function insertManyData(data:data[]){
    let many_users=await prisma.user.createMany({
        data:data,
        skipDuplicates:true
    });
    console.log(many_users);
}

async function find(id:number){
    let person= await prisma.user.findUnique({
        where:{
            id:id
        }
    })
    console.log(person);
}

async function findAll(){
    const users=await prisma.user.findMany({
        where:{
            email:{
                endsWith: '@gmail.com'
            },
        },
});
    console.log(users);
}

async function UpdateOne(id:number,password:string,email:string){
    const UpdatedUser=await prisma.user.update({
        where:{
            id:id
        },
        data:{
            email:email,
            password:password
        }
    })
    console.log(UpdatedUser);
}

async function DeleteOne(id:number){
    const deletedUser=await prisma.user.delete({
        where:{
            id:id
        }
    })
}
async function DeleteMany(){
    const deleted=await prisma.user.deleteMany({
        where:{
            password:"123"
        }
    })
    console.log(deleted);
}

//insertManyData(data1);
//insertData("abcdef@gmail.com","123","xyz");
//find(1);
// findAll();
//UpdateOne(1,"hello","world");
//find(1);
// DeleteOne(1);
//DeleteMany();
// findAll();

interface todo{
    title:string,
    desc?:string,
    userId:number
}


async function insertToDo(todos:todo[]){
    let many_users=await prisma.todo.createMany({
        data:todos,
        skipDuplicates:true
    });
    console.log(many_users);
}

// insertToDo([{
//     title:"title",
//     desc:"dec2",
//     userId:3
// }])

async function getTodoandUser(id:number){
    const user=await prisma.user.findUnique({
        where:{
            id:id
        },
        select:{
            firstName:true,
            todo:{
                select:{
                    id:true,
                    title:true
                }
            }
        }
    })
    console.log(user);
}

getTodoandUser(3);