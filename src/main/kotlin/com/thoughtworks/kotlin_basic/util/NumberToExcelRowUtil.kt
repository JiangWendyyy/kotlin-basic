package com.thoughtworks.kotlin_basic.util

private const val LETTERS_COUNT = 26

private const val ZZZ_ROW_NUMBER = 18278

class NumberToExcelRowUtil {
    fun numberToExcelRow(a: Int, b: Int): Array<String> {
        val resultArray = Array(b){ null.toString() }
        if(a+b> ZZZ_ROW_NUMBER)
            throw IllegalArgumentException("数据超出规定大小")
        for(i in a..<a + b){
            val sb = StringBuilder()
            var number = i
            while (number > 0) {
                val remainder = (number - 1) % LETTERS_COUNT
                sb.append('A' + remainder)
                number = (number - 1) / LETTERS_COUNT
            }
            resultArray[i-a] = sb.reverse().toString()
        }
        return resultArray
    }
}
