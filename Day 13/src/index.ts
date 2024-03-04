import express from 'express';
import multer from 'multer';
import {v2 as cloudinary} from 'cloudinary';
import mongoose from 'mongoose';
const Image=require("./model/file");
const app=express();
app.set("view engine","hbs");
cloudinary.config({
    cloud_name: '',
    api_key: '',
    api_secret: ''
});
const upload = multer({ dest: 'uploads/' });


app.get("/upload",(req,res)=>{
    res.render("../dest/views/form.hbs");
})
app.post("/upload",upload.single('file'),async (req,res)=>{
    console.log(req.body);
    console.log(req.file);
    const {filename} =req.body;
    const {path} = req.file;
    await cloudinary.uploader.upload(path,
    { public_id: "olympic_flag" },
    function(error, result) {console.log(result); });
    const newImage=new Image({filename:filename,imageURl:path});
    await newImage.save();
    res.send('file uploaded');
})
mongoose.connect('mongodb://127.0.0.1:27017/multercloud', (err) => {
  if (err) {
    console.error('Error connecting to MongoDB:', err);
  } else {
    app.listen(3333, () => {
      console.log('Server started at port 3333');
    });
  }
});