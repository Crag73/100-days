import mongoose from "mongoose";

const imageSchema=new mongoose.Schema({
    filename:String,
    imageURL:String,
})

module.exports=mongoose.model("Image",imageSchema);