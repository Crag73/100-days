console.log("running script");
let x=10;
function add(a,b){
    return a+b;
}

// module.exports.add=add;
// module.exports.x=x;

module.exports={
    x,
    add
}