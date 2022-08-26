package com.mutualmobile.libphonenumber

import cocoapods.libPhoneNumber_iOS.*


actual object PhoneUtil {

    private lateinit var instance: NBPhoneNumberUtil

    actual fun getInstance(context: ApplicationContext): NBPhoneNumberUtil {
        instance = PhoneNumberUtil.sharedInstance()!!
        return instance
    }

    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean {
        return instance.isPossibleNumberString(phoneNumber, countryCode, null)
    }

    actual fun isPossibleNumber(number: PhoneNumber): Boolean {
        return instance.isPossibleNumber(number)
    }

    actual fun isPossibleNumberForType(
        number: PhoneNumber,
        type: PhoneNumberType
    ): Boolean {
        val result = instance.isPossibleNumberWithReason(number, null)
        return (result == NBEValidationResultIS_POSSIBLE || result == NBEValidationResultIS_POSSIBLE_LOCAL_ONLY)
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
        phoneNumberType: PhoneNumberType,
        countryCallingCode: Int
    ): Boolean {
        return phoneNumberType == PhoneNumberType.FIXED_LINE || phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE
                || (getGeoMobileCountries().contains(countryCallingCode) && phoneNumberType == PhoneNumberType.MOBILE)
    }

    actual fun isNumberMatch(
        firstNumber: CharSequence,
        secondNumber: CharSequence
    ): MatchType {
        return when (instance.isNumberMatch(firstNumber, secondNumber, null)) {
            NBEMatchTypeNOT_A_NUMBER -> MatchType.NOT_A_NUMBER

            NBEMatchTypeNO_MATCH -> MatchType.NO_MATCH

            NBEMatchTypeSHORT_NSN_MATCH -> MatchType.SHORT_NSN_MATCH

            NBEMatchTypeNSN_MATCH -> MatchType.NSN_MATCH

            NBEMatchTypeEXACT_MATCH -> MatchType.EXACT_MATCH

            else -> MatchType.NO_MATCH
        }
    }

    actual fun isNumberMatch(
        firstNumber: PhoneNumber,
        secondNumber: CharSequence
    ): MatchType {
        return when (instance.isNumberMatch(firstNumber, secondNumber, null)) {
            NBEMatchTypeNOT_A_NUMBER -> MatchType.NOT_A_NUMBER

            NBEMatchTypeNO_MATCH -> MatchType.NO_MATCH

            NBEMatchTypeSHORT_NSN_MATCH -> MatchType.SHORT_NSN_MATCH

            NBEMatchTypeNSN_MATCH -> MatchType.NSN_MATCH

            NBEMatchTypeEXACT_MATCH -> MatchType.EXACT_MATCH

            else -> MatchType.NO_MATCH
        }
    }

    actual fun isNumberMatch(
        firstNumber: PhoneNumber,
        secondNumber: PhoneNumber
    ): MatchType {
        return when (instance.isNumberMatch(firstNumber, secondNumber, null)) {
            NBEMatchTypeNOT_A_NUMBER -> MatchType.NOT_A_NUMBER

            NBEMatchTypeNO_MATCH -> MatchType.NO_MATCH

            NBEMatchTypeSHORT_NSN_MATCH -> MatchType.SHORT_NSN_MATCH

            NBEMatchTypeNSN_MATCH -> MatchType.NSN_MATCH

            NBEMatchTypeEXACT_MATCH -> MatchType.EXACT_MATCH

            else -> MatchType.NO_MATCH
        }
    }

    private fun getGeoMobileCountries(): HashSet<Int> {
        val geoMobileCountriesWithoutMobileAreaCodes: HashSet<Int> = HashSet()
        geoMobileCountriesWithoutMobileAreaCodes.add(86)

        val geoMobileCountries: HashSet<Int> = HashSet()
        geoMobileCountries.add(52) // Mexico
        geoMobileCountries.add(54) // Argentina
        geoMobileCountries.add(55) // Brazil
        geoMobileCountries.add(62) // Indonesia: some prefixes only (fixed CMDA wireless)
        geoMobileCountries.addAll(geoMobileCountriesWithoutMobileAreaCodes)

        return geoMobileCountries
    }
}