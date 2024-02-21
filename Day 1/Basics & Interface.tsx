let num:number=7;     //loosely typed -> strongly typed
// console.log(num);



function greet(name:String):void{           //type inference - automatically selects type (number,void etc)
    console.log("Hello "+name);
}
// greet("abc");



function sum(num1:number,num2:number):number{
    return(num1+num2);
}
//console.log(sum(3,6));

function isLegal(age:number):boolean{
    if(age>=18){
        return true;
    }
    else{
        return false;
    }
}

//console.log(isLegal(17))


function fun1(fun2:()=>void):void{
    setTimeout(() => {
        fun2();
    }, 1000);
}

// fun1(function():void{
//     console.log("Hello");
// })


//Giving type to an object
//Interface - 1. Gives type to an object
//          - 2. To implement classes


function nameAndAge(user:{name:string,age:number}){
    console.log(user.name);
    console.log(user.age);
}

let User1={name:"hello",age:15}

//nameAndAge(User1);

function Age(user:{name:string,age:number}){
    console.log(user.age);
}

//To avoid this repetition of code, we use interface

interface User{
    name:String,         //Optional property as we have used '?'
    age:number   //Can not be changed
}

let User2={
    age:50
}

function Name(user:User){
    console.log(user.name);
}

//Name(User1);

//Classes

interface Person{
    name:string,
    age:number,
    greet:()=>void
}

class Employee implements Person{
    name:string;
    age:number;
    constructor(name:string,age:number){
        this.name=name;
        this.age=age;
    }
    greet():void{
        console.log("Hello "+this.name);
    }
}

let Employee1=new Employee("abc",123);
Employee1.greet();


