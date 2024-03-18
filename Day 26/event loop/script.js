console.log("hi");
function wait(){
    let currentTime=new Date().getTime();
    while(currentTime+20000>new Date().getTime()){

    }
};
for(let i=0;i<=50000000;i++){
    if(i==50000000){
        console.log("inside loop");
    }
}
wait();
console.log("loop end");