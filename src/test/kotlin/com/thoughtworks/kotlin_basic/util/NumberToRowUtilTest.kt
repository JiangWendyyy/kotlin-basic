package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class NumberToRowUtilTest {
    @Test
    fun `1,1 to A`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("A")
        println(numberToRowUtil.numberToRow(1, 1).contentToString())
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(1, 1)))
    }

    @Test
    fun `1,2 to A,B`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("A","B")
        println(numberToRowUtil.numberToRow(1, 1).contentToString())
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(1, 2)))
    }

    @Test
    fun `26,3 to Z,AA,AB`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("Z","AA","AB")
        println(numberToRowUtil.numberToRow(26, 3).contentToString())
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(26, 3)))
    }

    @Test
    fun `700,5 to ZX,ZY,ZZ,AAA,AAB`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("ZX","ZY","ZZ","AAA","AAB")
        println(numberToRowUtil.numberToRow(700, 5).contentToString())
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(700, 5)))
    }

    @Test
    fun `18273,6 to ZZU,ZZV,ZZW,ZZX,ZZY,ZZZ`() {
        val numberToRowUtil = NumberToRowUtil()
        val result = arrayOf("ZZU","ZZV","ZZW","ZZX","ZZY","ZZZ")
        println(numberToRowUtil.numberToRow(18273, 6).contentToString())
        assertTrue(result.contentEquals(numberToRowUtil.numberToRow(18273, 6)))
    }

    @Test
    fun `more than ZZZ`() {
        val numberToRowUtil = NumberToRowUtil()
        assertThrows<Exception>{numberToRowUtil.numberToRow(18293,6)}
    }


}
