const express = require('express')
const app = express();
const path = require('path')
const mongoose = require('mongoose');
const User = require("./model/user");
const bcrypt = require("bcrypt");
const cookieParser=require('cookie-parser');
const { createToken, verifyToken } = require("./auth/auth");

app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'static')))
app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.set('view engine', 'hbs');
app.get('/', (req, res) => {
    res.render('home');
})

app.get('/protected', verifyToken, (req, res) => {
    res.send("protected");
})

app.get('/signup', (req, res) => {
    res.render('signup');
})
app.get('/login', (req, res) => {
    res.render('login');
})

app.post("/signup", async (req, res) => {
    const { email, password } = req.body;
    let hashpassword = await bcrypt.hash(password, 10);
    let newUser = new User({ email, password: hashpassword });
    await newUser.save();
    res.json(newUser);
})

app.post("/login", async (req, res) => {
    const { email, password } = req.body;
    let user = await User.findOne({ email });
    if (!user) {
        return res.send("No user found")
    }
    bcrypt.compare(password, user.password).then((result) => {
        if (result) {
            let token = createToken(user.toJSON());                      //document to JSON -> tojson
            res.cookie("token", token);
            res.send({ token: token });                                     //otherwise -> stringify
        }
    });

})

mongoose.connect("mongodb://127.0.0.1:27017/jwt").then(() => {
    app.listen(3333, () => {
        console.log('server started at port 3333');
    })
})

