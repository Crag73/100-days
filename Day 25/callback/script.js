function chopping (cb){
    console.log("sabji katna shuru");
    setTimeout(()=>{
        console.log("sabji kat chuki h");
        cb(roti);
    },3000)
 }

 function cooking(cb){
    console.log("khana bnana shuru");
    setTimeout(()=>{
        console.log("khana bn gya ");
        cb(serve);
    },3000)
 }


 function roti(cb){
    console.log("roti bnana shuru");
    setTimeout(()=>{
        console.log("roti bn gyi ");
        cb();
    },2000)
 }

 function serve(){
    console.log("serve ho gya");
 }

//  chopping();
//  cooking();
//  roti();
//  serve();

chopping(cooking);