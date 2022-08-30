package com.mutualmobile.libphonenumber

expect object PhoneUtil {
    fun getInstance(context: ApplicationContext)

    fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean?

    fun isPossibleNumber(number: PhoneNumber): Boolean?

    fun isPossibleNumberForType(number: PhoneNumber, type: PhoneNumberType): Boolean?

    fun isAlphaNumber(number: String): Boolean?

    fun isValidNumber(number: PhoneNumber): Boolean?

    fun isValidNumberForRegion(number: PhoneNumber, countryCode: String): Boolean?

    fun isNumberGeographical(number: PhoneNumber): Boolean?

    fun isNumberGeographical(phoneNumberType: PhoneNumberType, countryCallingCode: Int): Boolean?

    fun isNumberMatch( firstNumber: CharSequence,  secondNumber: CharSequence): MatchType?

    fun isNumberMatch( firstNumber: PhoneNumber,  secondNumber: CharSequence): MatchType?

    fun isNumberMatch( firstNumber: PhoneNumber,  secondNumber: PhoneNumber): MatchType?

    fun canBeInternationallyDialed(number: PhoneNumber): Boolean?

    fun getCountryCodeForRegion(regionCode: String): Int?

    fun getPhoneNumberType(number: PhoneNumber): PhoneNumberType?

    fun isNANPACountry(regionCode: String): Boolean?

    fun isPossibleNumberWithReason(number: PhoneNumber): ValidationResult?
}