package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class NumberToExcelRowUtilTest {
    @Test
    fun `1,1 to A`() {
        val numberToExcelRowUtil = NumberToExcelRowUtil()
        val result = arrayOf("A")
        println(numberToExcelRowUtil.numberToExcelRow(1, 1).contentToString())
        assertTrue(result.contentEquals(numberToExcelRowUtil.numberToExcelRow(1, 1)))
    }
    @Test
    fun `1,2 to A,B`() {
        val numberToExcelRowUtil = NumberToExcelRowUtil()
        val result = arrayOf("A","B")
        println(numberToExcelRowUtil.numberToExcelRow(1, 1).contentToString())
        assertTrue(result.contentEquals(numberToExcelRowUtil.numberToExcelRow(1, 2)))
    }
    @Test
    fun `26,3 to Z,AA,AB`() {
        val numberToExcelRowUtil = NumberToExcelRowUtil()
        val result = arrayOf("Z","AA","AB")
        println(numberToExcelRowUtil.numberToExcelRow(26, 3).contentToString())
        assertTrue(result.contentEquals(numberToExcelRowUtil.numberToExcelRow(26, 3)))
    }
    @Test
    fun `700,5 to ZX,ZY,ZZ,AAA,AAB`() {
        val numberToExcelRowUtil = NumberToExcelRowUtil()
        val result = arrayOf("ZX","ZY","ZZ","AAA","AAB")
        println(numberToExcelRowUtil.numberToExcelRow(700, 5).contentToString())
        assertTrue(result.contentEquals(numberToExcelRowUtil.numberToExcelRow(700, 5)))
    }
    @Test
    fun `18273,6 to ZZU,ZZV,ZZW,ZZX,ZZY,ZZZ`() {
        val numberToExcelRowUtil = NumberToExcelRowUtil()
        val result = arrayOf("ZZU","ZZV","ZZW","ZZX","ZZY","ZZZ")
        println(numberToExcelRowUtil.numberToExcelRow(18273, 6).contentToString())
        assertTrue(result.contentEquals(numberToExcelRowUtil.numberToExcelRow(18273, 6)))
    }
    @Test
    fun `more than ZZZ`() {
        val numberToExcelRowUtil = NumberToExcelRowUtil()
        assertThrows<Exception>{numberToExcelRowUtil.numberToExcelRow(18293,6)}
    }
}
