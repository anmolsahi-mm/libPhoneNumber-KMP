package com.mutualmobile.libphonenumber

import cocoapods.libPhoneNumber_iOS.NBPhoneNumberUtil

actual class PhoneUtil {
    val phoneUtil = NBPhoneNumberUtil.sharedInstance()
    actual fun isValidNumber(number: String): Boolean {
//        val numberProto = phoneUtil?.parse(number, "CH", "")

        return false
    }
}