package com.mutualmobile.libphonenumber

actual object PhoneUtil {

    private val instance: PhoneNumberUtil by lazy {
        PhoneNumberUtil.createInstance(application)
    }
//    actual fun initialize(context: ApplicationContext?) {
//        if (context == null) {
//            throw Exception("No context passed to PhoneUtil.initialize")
//        } else {
//            synchronized(this) {
//                if (instance == null) {
//                    instance = PhoneNumberUtil.createInstance(context)
//                }
//            }
//        }
//    }

    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean? =
        instance?.isPossibleNumber(phoneNumber, countryCode)

    actual fun isPossibleNumber(number: PhoneNumber): Boolean? =
        instance?.isPossibleNumber(number)

    actual fun isPossibleNumberForType(number: PhoneNumber, type: PhoneNumberType): Boolean? =
        instance?.isPossibleNumberForType(number, type)

    actual fun isAlphaNumber(number: String): Boolean? =
        instance?.isAlphaNumber(number)

    actual fun isValidNumber(number: PhoneNumber): Boolean? =
        instance?.isValidNumber(number)

    actual fun isValidNumberForRegion(number: PhoneNumber, countryCode: String): Boolean? =
        instance?.isValidNumberForRegion(number, countryCode)

    actual fun isNumberGeographical(number: PhoneNumber): Boolean? =
        instance?.isNumberGeographical(number)

    actual fun isNumberGeographical(phoneNumberType: PhoneNumberType, countryCallingCode: Int): Boolean? =
        instance?.isNumberGeographical(phoneNumberType, countryCallingCode)

    actual fun isNumberMatch(firstNumber: CharSequence, secondNumber: CharSequence): MatchType? =
        instance?.isNumberMatch(firstNumber, secondNumber)

    actual fun isNumberMatch(firstNumber: PhoneNumber, secondNumber: CharSequence): MatchType? =
        instance?.isNumberMatch(firstNumber, secondNumber)

    actual fun isNumberMatch(firstNumber: PhoneNumber, secondNumber: PhoneNumber): MatchType? =
        instance?.isNumberMatch(firstNumber, secondNumber)

    actual fun canBeInternationallyDialed(number: PhoneNumber): Boolean? =
        instance?.canBeInternationallyDialled(number)

    actual fun getCountryCodeForRegion(regionCode: String): Int? =
        instance?.getCountryCodeForRegion(regionCode)

    actual fun getPhoneNumberType(number: PhoneNumber): PhoneNumberType? =
        instance?.getNumberType(number)

    actual fun isNANPACountry(regionCode: String): Boolean? =
        instance?.isNANPACountry(regionCode)

    actual fun isPossibleNumberWithReason(number: PhoneNumber): ValidationResult? =
        instance?.isPossibleNumberWithReason(number)
}