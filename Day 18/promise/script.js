
function kalsepadhunga(marks){
    return new Promise((resolve,reject)=>{
        if(marks<75){
            resolve("thik se man laga ke padhana shuru")
        }
        else{
            reject("jesa chal rha hai chalne do jaida pdne ki jrurt nhi")
        }
    });
}


//consuming a promise

// 1) .then();
// 

let p=kalsepadhunga(80);
console.log(p);
p.then(
    function(data){ //resolve
        console.log("resolve")
        console.log(data);
    },
    function(data){ //reject
        console.log("reject");
        console.log(data);
    }
)
kalsepadhunga(50).then(
    function(data){
        console.log(data);
    },
    function(data){
        console.log(data);
    }
)

//2) .then().catch()

kalsepadhunga(25).then((data)=>{
    console.log("then");
    console.log(data);
}).catch((data)=>{
    console.log("catch");
    console.log(data);
})