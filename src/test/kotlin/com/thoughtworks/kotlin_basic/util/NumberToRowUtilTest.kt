package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberToRowUtilTest {
    @Test
    fun `1,2 to A,B`() {
        val numberToRowUtil = NumberToRowUtil()
        var result = arrayOf("A","B")
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(1, 2)))
    }
}
