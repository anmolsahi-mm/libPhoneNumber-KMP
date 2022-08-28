package com.mutualmobile.libphonenumber

actual object PhoneUtil {

    private lateinit var instance: PhoneNumberUtil

    actual fun getInstance(context: ApplicationContext): PhoneNumberUtil {
        instance = PhoneNumberUtil.createInstance(context)
        return instance
    }

    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean {
        return instance.isPossibleNumber(phoneNumber, countryCode)
    }

    actual fun isPossibleNumber(number: PhoneNumber): Boolean {
        return instance.isPossibleNumber(number)
    }

    actual fun isPossibleNumberForType(number: PhoneNumber, type: PhoneNumberType): Boolean {
        return instance.isPossibleNumberForType(number, type)
    }

    actual fun isAlphaNumber(number: String): Boolean =
        instance.isAlphaNumber(number)

    actual fun isValidNumber(number: PhoneNumber): Boolean {
        return instance.isValidNumber(number)
    }

    actual fun isValidNumberForRegion(number: PhoneNumber, countryCode: String): Boolean {
        return isValidNumberForRegion(number, countryCode)
    }

    actual fun isNumberGeographical(number: PhoneNumber): Boolean {
        return instance.isNumberGeographical(number)
    }

    actual fun isNumberGeographical(phoneNumberType: PhoneNumberType, countryCallingCode: Int): Boolean {
        return instance.isNumberGeographical(phoneNumberType, countryCallingCode)
    }

    actual fun isNumberMatch(firstNumber: CharSequence, secondNumber: CharSequence): MatchType {
        return instance.isNumberMatch(firstNumber, secondNumber)
    }

    actual fun isNumberMatch(firstNumber: PhoneNumber, secondNumber: CharSequence): MatchType {
        return instance.isNumberMatch(firstNumber, secondNumber)
    }

    actual fun isNumberMatch(firstNumber: PhoneNumber, secondNumber: PhoneNumber): MatchType {
        return instance.isNumberMatch(firstNumber, secondNumber)
    }

    actual fun canBeInternationallyDialed(number: PhoneNumber): Boolean {
        return instance.canBeInternationallyDialled(number)
    }

    actual fun getCountryCodeForRegion(regionCode: String): Int {
        return instance.getCountryCodeForRegion(regionCode)
    }

    actual fun getPhoneNumberType(number: PhoneNumber): PhoneNumberType {
        return instance.getNumberType(number)
    }

    actual fun isNANPACountry(regionCode: String): Boolean {
        return instance.isNANPACountry(regionCode)
    }

    actual fun isPossibleNumberWithReason(number: PhoneNumber): ValidationResult {
        return instance.isPossibleNumberWithReason(number)
    }
}