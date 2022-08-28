package com.mutualmobile.libphonenumber

import isPossibleNumber as possibleNumber
import isValidNumberForRegion as validNumberForRegion

actual object PhoneUtil {

    actual fun getInstance(context: ApplicationContext): PhoneNumberUtil {
        TODO("Not yet implemented")
    }

    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean {
        return possibleNumber(phoneNumber)
    }

    actual fun isPossibleNumber(number: PhoneNumber): Boolean {
    }

    actual fun isPossibleNumberForType(
        number: PhoneNumber,
        type: PhoneNumberType
    ): Boolean {
        TODO("Not yet implemented")
    }

    actual fun isAlphaNumber(number: String): Boolean {
        TODO("Not yet implemented")
    }

    actual fun isValidNumber(number: PhoneNumber): Boolean {
        TODO("Not yet implemented")
    }

    actual fun isValidNumberForRegion(
        number: PhoneNumber,
        countryCode: String
    ): Boolean {
        return validNumberForRegion(number, countryCode)
    }

    actual fun isNumberGeographical(number: PhoneNumber): Boolean {
        TODO("Not yet implemented")
    }

    actual fun isNumberGeographical(
        phoneNumberType: PhoneNumberType,
        countryCallingCode: Int
    ): Boolean {
        TODO("Not yet implemented")
    }

    actual fun isNumberMatch(
        firstNumber: CharSequence,
        secondNumber: CharSequence
    ): MatchType {
        TODO("Not yet implemented")
    }

    actual fun isNumberMatch(
        firstNumber: PhoneNumber,
        secondNumber: CharSequence
    ): MatchType {
        TODO("Not yet implemented")
    }

    actual fun isNumberMatch(
        firstNumber: PhoneNumber,
        secondNumber: PhoneNumber
    ): MatchType {
        TODO("Not yet implemented")
    }

}