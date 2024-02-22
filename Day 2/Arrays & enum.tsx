let a:number[]=[1,2,3];

let str:string[]=["hsfd","sgfd","a"];

type ArrNumOrStr= number | string;

function getFirstElement(a:number[]|string[]){
    return a[0];
}

function getFirstElement1(a:ArrNumOrStr[]){
    return a[0];
}

// console.log(getFirstElement1([1,2,3,4]));
// console.log(getFirstElement(["abdf","adfsgfd","abc"]));
// console.log(getFirstElement1([1,"h"]));           //problem with using type like that

//[{},{},{}];

interface UserInterface{
    name:string,
    age:number;
}

// type UserInterface={
//     name:string,
//     age:number;
// }

let user5=[
    {
        name:"ahdf",
        age:40
    },
    {
        name:"hgf",
        age:30
    },
    {
        name:"ghkdf",
        age:17
    },
    {
        name:"lo",
        age:19
    }
]

function isLegal2(user:UserInterface[]){
    let res=user.filter(u=>u.age>18);
    return res;
}

console.log(isLegal2(user5));


type keypress= "up" | "down" | "left" | "right"

function some(keypress:keypress){
    console.log(keypress);
}
some("up")
// some("random")
//enum - It is used to make named constants
enum keyinput{
    up ="up",
    down ="down",
    left="left",
    right="right"
}
function some2(keypress:keyinput){
    if(keypress===keyinput.down){
        //
    }
    console.log(keypress)
}
some2(keyinput.up);
some2(keyinput.down);
some2(keyinput.left);
some2(keyinput.right);
//enum is also used in express -> res.status(200).send("success")
//the status code (200 here) is constant so we use it for such purpose
enum Status{
    success=200,            //if the status code changes, we can directly change it from here
    failure=400,            //than going over the whole code and changing it one by one
    serverError=500         // res.status(status.success) & res.status(status.failure)
}


