package com.mutualmobile.libphonenumber

import com.mutualmobile.libphonenumber.libphonenumber.AsYouType
import com.mutualmobile.libphonenumber.libphonenumber.parse

actual object PhoneUtil {

    private var nanpaRegions: Set<String> = HashSet(35)
    private const val NANPA_COUNTRY_CODE = 1


    init {
        nanpaRegions.addAll(countryCallingCodeToRegionCodeMap.get(NANPA_COUNTRY_CODE))
    }



    actual fun isPossibleNumber(phoneNumber: String, countryCode: String): Boolean? {
        return com.mutualmobile.libphonenumber.libphonenumber.isPossibleNumber(phoneNumber, countryCode)
    }

    actual fun isPossibleNumber(number: PhoneNumber): Boolean? {
        return com.mutualmobile.libphonenumber.libphonenumber.isPossibleNumber(number)
    }

    actual fun isPossibleNumberForType(
        number: PhoneNumber,
        type: PhoneNumberType
    ): Boolean? {
        val numberType = com.mutualmobile.libphonenumber.libphonenumber.getNumberType(number)
        val nationalNumber = AsYouType().getNationalNumber()
        val countryCode = AsYouType().getCallingCode()
        return com.mutualmobile.libphonenumber.libphonenumber.isPossibleNumberForType(number)
    }

    actual fun isAlphaNumber(number: String): Boolean? {
        val isVaiablePhoneNumber = com.mutualmobile.libphonenumber.libphonenumber.isVia
        return com.mutualmobile.libphonenumber.libphonenumber.isAlphaNumber(number)
    }

    actual fun isValidNumber(number: PhoneNumber): Boolean? {
        return com.mutualmobile.libphonenumber.libphonenumber.isValidNumber(number)
    }

    actual fun isValidNumberForRegion(
        number: PhoneNumber,
        countryCode: String
    ): Boolean? {
        return com.mutualmobile.libphonenumber.libphonenumber.isValidNumberForRegion(number)
    }

    actual fun isNumberGeographical(number: PhoneNumber): Boolean? {
        return com.mutualmobile.libphonenumber.libphonenumber.isNumberGeographical(number)
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
        try {
            val firstNumberAsProto: PhoneNumber =
                parse(firstNumber.toString(), UNKNOWN_REGION)
            return isNumberMatch(firstNumberAsProto, secondNumber)
        } catch (e: NumberParseException) {
            if (e.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                try {
                    val secondNumberAsProto: PhoneNumber =
                        parse(secondNumber.toString(), PhoneNumberUtil.UNKNOWN_REGION)
                    return isNumberMatch(secondNumberAsProto, firstNumber)
                } catch (e2: NumberParseException) {
                    if (e2.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                        try {
                            val firstNumberProto: PhoneNumber = PhoneNumber()
                            val secondNumberProto: PhoneNumber = PhoneNumber()
                            parseHelper(firstNumber, null, false, false, firstNumberProto)
                            parseHelper(secondNumber, null, false, false, secondNumberProto)
                            return isNumberMatch(firstNumberProto, secondNumberProto)
                        } catch (e3: com.google.i18n.phonenumbers.NumberParseException) {
                            // Fall through and return MatchType.NOT_A_NUMBER.
                        }
                    }
                }
            }
        }
        // One or more of the phone numbers we are trying to match is not a viable phone number.
        // One or more of the phone numbers we are trying to match is not a viable phone number.
        return PhoneNumberUtil.MatchType.NOT_A_NUMBER
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
        return com.mutualmobile.libphonenumber.libphonenumber.canBeInternationallyDialled(number)
    }

    actual fun getCountryCodeForRegion(regionCode: String): Int? {
        return com.mutualmobile.libphonenumber.libphonenumber.getCountryCallingCode(regionCode).toInt()
    }

    actual fun getPhoneNumberType(number: PhoneNumber): PhoneNumberType? {
        val phoneNumberType = com.mutualmobile.libphonenumber.libphonenumber.getNumberType(number)
        return PhoneNumberType.values().find {it.name == phoneNumberType}
    }

    actual fun isNANPACountry(regionCode: String): Boolean? {
        return nanpaRegions.contains(regionCode)
    }

    actual fun isPossibleNumberWithReason(number: PhoneNumber): ValidationResult? {
        return com.mutualmobile.libphonenumber.libphonenumber.isPossibleNumberWithReason(number)
    }

    fun isViablePhoneNumber(number: CharSequence): Boolean {
        if (number.length < MIN_LENGTH_FOR_NSN) {
            return false
        }
        val m: java.util.regex.Matcher =
            com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_PHONE_NUMBER_PATTERN.matcher(number)
        return m.matches()
    }

    private const val MIN_LENGTH_FOR_NSN = 2



}