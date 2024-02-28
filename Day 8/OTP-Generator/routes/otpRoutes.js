const express = require("express");
const otpController = require("../controllers/optController");
const router = express.Router();
router.post('/send-otp', otpController.sendOTP);
module.exports = router;