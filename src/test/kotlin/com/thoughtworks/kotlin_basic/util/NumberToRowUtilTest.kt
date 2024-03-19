package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

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
        val result = arrayOf("Z","AA","AB")
        println(java.util.Arrays.toString(numberToRowUtil.numberToRow(26, 3)))
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(26, 3)))
    }

    @Test
    fun `700,5 to ZX,ZY,ZZ,AAA,AAB`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("ZX","ZY","ZZ","AAA","AAB")
        println(java.util.Arrays.toString(numberToRowUtil.numberToRow(700, 5)))
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(700, 5)))
    }

    @Test
    fun `18273,6 to ZZU,ZZV,ZZW,ZZX,ZZY,ZZZ`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("ZZU","ZZV","ZZW","ZZX","ZZY","ZZZ")
        println(java.util.Arrays.toString(numberToRowUtil.numberToRow(18273, 6)))
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(18273, 6)))
    }

    @Test
    fun `more than ZZZ`() {
        val numberToRowUtil = NumberToRowUtil()
        var exception = assertThrows<Exception>{numberToRowUtil.numberToRow(18283,6)}
        assertTrue(exception!=null)
    }


}
