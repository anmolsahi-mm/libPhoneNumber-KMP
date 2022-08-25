package com.mutualmobile.libphonenumber

import com.google.i18n.phonenumbers.PhoneNumberUtil

actual class PhoneUtil {
    private val phoneUtil: PhoneNumberUtil = PhoneNumberUtil.getInstance()
    actual fun isValidNumber(number: String): Boolean {
        val numberProto = phoneUtil.parse(number, "US")

        return phoneUtil.isValidNumber(numberProto)
    }
}