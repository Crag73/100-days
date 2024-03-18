let sub1=function(c,d){
    console.log(c-d);
}

let sub2=(c,d)=>{
    console.log(c-d);
}

//if single arugument no need of paranthese

let mul=x=>{
    console.log("multiply by x");
}

//if single line of code

let mul2=x=> console.log("multiply by x");
//if { } is used return keyword is must
let sum1=(x,y)=>{
    return x+y;
}
//if no { } is used,there is no need of return keyword

let sum2=(x,y)=> x+y;

let sub=(x,y)=> x-y;

console.log(sub(5,3));