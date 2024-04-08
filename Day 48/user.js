const express = require("express");
const user = require("../models/User");
const router = express.Router();

router.post("/", async (req, res) => {
    const { name, email, password, skills, skillsToLearn } = req.body;
    const newUser = new user({ name: name, email: email, password: password, skills: skills, skillsToLearn: skillsToLearn });
    await newUser.save();
    console.log(newUser);
    res.send(newUser);
})

router.get("/", async (req, res) => {
    let users = await user.find({});
    console.log(users);
    res.send(users);
})

module.exports = router;