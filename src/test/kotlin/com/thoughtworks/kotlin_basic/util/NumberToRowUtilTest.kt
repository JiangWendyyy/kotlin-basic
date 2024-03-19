package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberToRowUtilTest {
    @Test
    fun `1,1 to A`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("A")
        println(java.util.Arrays.toString(numberToRowUtil.numberToRow(1, 1)))
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(1, 1)))
    }

    @Test
    fun `1,2 to A,B`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("A","B")
        println(java.util.Arrays.toString(numberToRowUtil.numberToRow(1, 1)))
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(1, 2)))
    }

    @Test
    fun `26,3 to Z,AA,AB`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("Z","AA")
        println(java.util.Arrays.toString(numberToRowUtil.numberToRow(26, 2)))
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(26, 2)))
    }


}
