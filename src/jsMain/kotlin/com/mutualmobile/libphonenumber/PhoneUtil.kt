package com.mutualmobile.libphonenumber

actual object PhoneUtil {
    actual fun getInstance(context: ApplicationContext) {
    }

    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isPossibleNumber(number: PhoneNumber): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isPossibleNumberForType(
        number: PhoneNumber,
        type: PhoneNumberType
    ): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isAlphaNumber(number: String): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isValidNumber(number: PhoneNumber): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isValidNumberForRegion(
        number: PhoneNumber,
        countryCode: String
    ): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isNumberGeographical(number: PhoneNumber): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isNumberGeographical(
        phoneNumberType: PhoneNumberType,
        countryCallingCode: Int
    ): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isNumberMatch(
        firstNumber: CharSequence,
        secondNumber: CharSequence
    ): MatchType? {
        TODO("Not yet implemented")
    }

    actual fun isNumberMatch(
        firstNumber: PhoneNumber,
        secondNumber: CharSequence
    ): MatchType? {
        TODO("Not yet implemented")
    }

    actual fun isNumberMatch(
        firstNumber: PhoneNumber,
        secondNumber: PhoneNumber
    ): MatchType? {
        TODO("Not yet implemented")
    }

    actual fun canBeInternationallyDialed(number: PhoneNumber): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun getCountryCodeForRegion(regionCode: String): Int? {
        TODO("Not yet implemented")
    }

    actual fun getPhoneNumberType(number: PhoneNumber): PhoneNumberType? {
        TODO("Not yet implemented")
    }

    actual fun isNANPACountry(regionCode: String): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isPossibleNumberWithReason(number: PhoneNumber): ValidationResult? {
        TODO("Not yet implemented")
    }


}