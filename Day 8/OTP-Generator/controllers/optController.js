const otpGenerator = require("otp-generator");
const OTP = require("../models/otpModel.js");
const User = require("../models/UserModel.js");

exports.sendOTP = async (req, res) => {
    try {
        const { email } = req.body;
        const checkUserPresent = await User.findOne({ email });
        if (checkUserPresent) {
            return res.status(401).json({
                success: false,
                message: "User is already registered"
            });
        }
        let otp = otpGenerator.generate(6, {
            upperCaseAlphabets: false,
            lowerCaseAlphabets: false,
            specialChars: false
        });
        result = await OTP.findOne({ otp: otp });
        while (result) {
            otp = otpGenerator.generate(6, {
                upperCaseAlphabets: false
            });
            result = await OTP.findOne({ otp: otp });
        }
        const otpPayload = { email, otp };
        const otpBody = await OTP.create(otpPayload);
        res.status(200).json({
            success: true,
            message: "OTP Sent Successfully",
            opt
        });
    }
    catch (err) {
        console.log(err.message);
        return res.status(500).json({ success: false, error: err.message });
    }
};