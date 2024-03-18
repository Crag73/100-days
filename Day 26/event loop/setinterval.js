let returnVal=setInterval(()=>{
    console.log("Inside setInterval");
},2000)

// console.log(returnVal);

let second=setInterval(()=>{
    console.log("Inside second setInterval");
},3000)

// console.log (second);

setTimeout(()=>{
    clearInterval(returnVal);
},5000)