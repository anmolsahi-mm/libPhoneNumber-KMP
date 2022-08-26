package com.mutualmobile.libphonenumber

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber

actual object PhoneUtil {

    private lateinit var instance: PhoneNumberUtil

    actual fun getInstance(context: ApplicationContext): PhoneNumberUtil {
        instance = PhoneNumberUtil.getInstance()
        return instance
    }

    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean {
        return instance.isPossibleNumber(phoneNumber, countryCode)
    }

    actual fun isPossibleNumber(number: PhoneNumber): Boolean {
        return instance.isPossibleNumber(number)
    }

    actual fun isPossibleNumberForType(
        number: com.mutualmobile.libphonenumber.PhoneNumber,
        type: PhoneNumberType
    ): Boolean {
        return instance.isPossibleNumberForType(number, type)
    }

    actual fun isAlphaNumber(number: String): Boolean =
        instance.isAlphaNumber(number)

    actual fun isValidNumber(number: com.mutualmobile.libphonenumber.PhoneNumber): Boolean {
        return instance.isValidNumber(number)
    }

    actual fun isValidNumberForRegion(number: PhoneNumber, countryCode: String): Boolean {
        return instance.isValidNumberForRegion(number, countryCode)
    }

    actual fun isNumberGeographical(number: PhoneNumber): Boolean {
        return instance.isNumberGeographical(number)
    }

    actual fun isNumberGeographical(
        number: PhoneNumber,
        countryCallingCode: Int
    ): Boolean {
        return isNumberGeographical(number, countryCallingCode)
    }


}