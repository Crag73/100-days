const jwt = require('jsonwebtoken');
const secretkey = "divyam";


module.exports.createToken = (user) => {
    let token = jwt.sign(user, secretkey);
    return token;
}

module.exports.verifyToken=(req,res,next)=>{
    let token=req.cookies.token;
    let decode=jwt.verify(token,secretkey);
    console.log(decode);
    if(decode){
        next();
    }
}