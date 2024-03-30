function starter(cb){
    console.log("Starter aa gya");
    setTimeout(()=>{
        console.log("Starter kha liya");
        cb(maincourse);
    },2000);
}

function drinks(cb){
    console.log("Drinks aa gyi");
    setTimeout(()=>{
        console.log("muje nhi chadi");
        cb(bill);
    },1000);
}

function maincourse(cb){
    console.log("Maincourse aa gya");
    setTimeout(()=>{
        console.log("Maincourse khatam");
        cb();
    },5000);
}

function bill(){
    console.log("Bill aa gya");
    setTimeout(()=>{
        console.log("Bill idta jayda bharna pda");
    },2000);
}

starter(drinks);