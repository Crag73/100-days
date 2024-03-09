function chopping(vegetable){
    return new Promise((resolve,reject)=>{
        setTimeout(() => {
            let choppedvege="chopped "+vegetable;
            resolve(choppedvege);
        }, 2000);
    })
}

function cooking(chopped,length){
    return new Promise((resolve,reject)=>{
        if(length<4){
            setTimeout(()=>{
                resolve("khana tyar hai");
            },2000)
        }
            else{
                reject("khana nhi bnega");
            }
    })
}

chopping("potato",70).then((data)=>{
    console.log(data);
    return cooking(data,6);
}).then((data)=>{
    console.log(data);
}).catch((data)=>{
    console.log(data);
})

async function myTask(){
    try{
    let data=await chopping("potato",0);
    console.log(data);
    let data2=await cooking(data,2);
    console.log(data2);
} catch (error){
    console.log(error);
}}
myTask();
