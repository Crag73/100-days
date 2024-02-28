const bcrypt = require("bcrypt");
const User = require("../models/UserModel");
const opt = require("../models/otpModel");

exports.signup = async (req, res) => {
    try {
        const { name, email, password, role, otp } = req.body;

        if (!name || !email || !password || !otp) {
            return res.status(403).json({
                success: false,
                message: "All fields are required"
            });
        }
        const existingUser = await User.findOne({ email });
        if (existingUser) {
            return res.status(400).json({
                success: false,
                message: "User already exists"
            })
        }
        const response = await otp.findOne({ email }).sort({ createdAt: -1 }).limit(1);
        if (response.length() === 0 || otp !== response[0].otp) {
            return res.status(400).json({
                success: false,
                message: "The OTP is not valid"
            });
        }
        let hashPassword;
        try {
            hashPassword = await bcrypt.hash(password, 10);
        }
        catch (err) {
            return res.status(500).json({
                success: false,
                message: `hashing password error for ${password} ` + err.message
            });
        }
        const newUser = await User.create({
            name,
            email,
            password: hashPassword,
            role
        });
        return res.status(201).json({
            success: true,
            message: "User registered",
            user: newUser
        });
    } catch (err) {
        console.log(err.message);
        return res.status(500).json({ success: false, error: err.message })
    }
}