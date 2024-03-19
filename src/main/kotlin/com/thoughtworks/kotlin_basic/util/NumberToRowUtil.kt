package com.thoughtworks.kotlin_basic.util

class NumberToRowUtil {
    fun numberToRow(a: Int, b: Int): Array<String?> {
        val result = Array<String?>(b) {null}
        var row = a
        for (i in 0..<b){
            val number = ('A'.code + row - 1).toChar()
            result[i] = number.toString()
            row++
        }
        return result
    }
}
