package com.mutualmobile.libphonenumber

import cocoapods.libPhoneNumber_iOS.NBPhoneNumberUtil
import platform.Foundation.NSError


actual object PhoneUtil {

    private lateinit var instance: NBPhoneNumberUtil

    actual fun getInstance(context: ApplicationContext): NBPhoneNumberUtil {
        instance = PhoneNumberUtil.sharedInstance()!!
        return instance
    }

    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean {
        return instance.isPossibleNumberString(phoneNumber, countryCode, NSError())
    }

    actual fun isPossibleNumber(number: PhoneNumber): Boolean {
        return instance.isPossibleNumber(number)
    }

    actual fun isPossibleNumberForType(
        number: PhoneNumber,
        type: PhoneNumberType
    ): Boolean {
        return instance.isPossibleNumberWithReason()
    }

    actual fun isAlphaNumber(number: String): Boolean =
        instance.isAlphaNumber(number)

    actual fun isValidNumber(number: PhoneNumber): Boolean {
        return instance.isValidNumber(number)
    }

    actual fun isValidNumberForRegion(
        number: PhoneNumber,
        countryCode: String
    ): Boolean {
        return instance.isValidNumberForRegion(number, countryCode)
    }

    actual fun isNumberGeographical(number: PhoneNumber): Boolean {
        return instance.isNumberGeographical(number)
    }

    actual fun isNumberGeographical(
        number: PhoneNumber,
        countryCallingCode: Int
    ): Boolean {
        return instance.isNumberGeographical(number, countryCallingCode)
    }

}