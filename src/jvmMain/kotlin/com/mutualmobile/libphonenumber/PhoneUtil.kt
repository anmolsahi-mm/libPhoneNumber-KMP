package com.mutualmobile.libphonenumber

actual object PhoneUtil {
    actual fun initialize(context: ApplicationContext) {
    }

    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isPossibleNumber(number: com.mutualmobile.libphonenumber.PhoneNumber): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isPossibleNumberForType(
        number: com.mutualmobile.libphonenumber.PhoneNumber,
        type: PhoneNumberType
    ): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isAlphaNumber(number: String): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isValidNumber(number: com.mutualmobile.libphonenumber.PhoneNumber): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isValidNumberForRegion(
        number: com.mutualmobile.libphonenumber.PhoneNumber,
        countryCode: String
    ): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isNumberGeographical(number: com.mutualmobile.libphonenumber.PhoneNumber): Boolean? {
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
        firstNumber: com.mutualmobile.libphonenumber.PhoneNumber,
        secondNumber: CharSequence
    ): MatchType? {
        TODO("Not yet implemented")
    }

    actual fun isNumberMatch(
        firstNumber: com.mutualmobile.libphonenumber.PhoneNumber,
        secondNumber: com.mutualmobile.libphonenumber.PhoneNumber
    ): MatchType? {
        TODO("Not yet implemented")
    }

    actual fun canBeInternationallyDialed(number: com.mutualmobile.libphonenumber.PhoneNumber): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun getCountryCodeForRegion(regionCode: String): Int? {
        TODO("Not yet implemented")
    }

    actual fun getPhoneNumberType(number: com.mutualmobile.libphonenumber.PhoneNumber): PhoneNumberType? {
        TODO("Not yet implemented")
    }

    actual fun isNANPACountry(regionCode: String): Boolean? {
        TODO("Not yet implemented")
    }

    actual fun isPossibleNumberWithReason(number: com.mutualmobile.libphonenumber.PhoneNumber): ValidationResult? {
        TODO("Not yet implemented")
    }


}