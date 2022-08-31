package com.mutualmobile.libphonenumber

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class PhoneUtilTest {

    @Test
    fun isPossibleNumberTest() {
        val phoneNumber = PhoneNumber()
        phoneNumber.countryCode = +95
        phoneNumber.nationalNumber = 9041274648
        val number = phoneNumber
        val result = PhoneUtil.isValidNumber(phoneNumber)
        if (result != null) {
            assertFalse(result)
        }

    }
}