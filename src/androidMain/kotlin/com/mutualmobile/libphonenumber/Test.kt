package com.mutualmobile.libphonenumber

import java.util.Locale

class Test {
    val util = PhoneUtil.getInstance(ApplicationContext())
    fun getValue() {
        val number = PhoneNumber()

        number.countryCode = +91
        number.nationalNumber

        Locale.ENGLISH
        util.isPossibleNumber(number)
    }
}