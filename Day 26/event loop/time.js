digi();
function digi(){
let container=document.querySelector(".time");
let time=new Date();
time=time.toLocaleTimeString();
container.innerHTML=time;
}
setInterval(digi,1000);

function updatecolor(){
    if(document.body.style.backgroundColor == "yellow"){
        document.body.style.backgroundColor = "pink";
    }
    else{
        document.body.style.backgroundColor = "yellow";
    }
}