package com.mutualmobile.libphonenumber

import org.junit.Before
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class PhoneUtilTest {

    @Before
    fun setUp() {
        AppContextProvider().onCreate()
    }

    @Test
    fun isPossibleNumber_returnTrue() {
        val result = PhoneUtil.isPossibleNumber("9041274648", "IN")
        if (result != null) {
            assertTrue(result)
        }
    }

    @Test
    fun isPossibleNumber_returnsFalse() {
        val result = PhoneUtil.isPossibleNumber("90274648", "IN")
        if (result != null) {
            assertFalse(result)
        }
    }

    @Test
    fun isValidNumber_retrunsTrue() {
        val phoneNumber = PhoneNumber()
            .setCountryCode(+91)
            .setNationalNumber(9041274648)

        val result = PhoneUtil.isValidNumber(phoneNumber)
        if (result != null) {
            assertTrue(result)
        }

    }
}