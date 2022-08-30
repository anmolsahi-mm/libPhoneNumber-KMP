package com.mutualmobile.libphonenumber

actual enum class ValidationResult {
    /** The number length matches that of valid numbers for this region.  */
    IS_POSSIBLE,

    /**
     * The number length matches that of local numbers for this region only (i.e. numbers that may
     * be able to be dialled within an area, but do not have all the information to be dialled from
     * anywhere inside or outside the country).
     */
    IS_POSSIBLE_LOCAL_ONLY,

    /** The number has an invalid country calling code.  */
    INVALID_COUNTRY_CODE,

    /** The number is shorter than all valid numbers for this region.  */
    TOO_SHORT,

    /**
     * The number is longer than the shortest valid numbers for this region, shorter than the
     * longest valid numbers for this region, and does not itself have a number length that matches
     * valid numbers for this region. This can also be returned in the case where
     * isPossibleNumberForTypeWithReason was called, and there are no numbers of this type at all
     * for this region.
     */
    INVALID_LENGTH,

    /** The number is longer than all valid numbers for this region.  */
    TOO_LONG,
    UNKNOWN
}