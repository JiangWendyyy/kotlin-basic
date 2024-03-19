package com.thoughtworks.kotlin_basic.util

import com.sun.org.apache.xml.internal.security.utils.JavaUtils

class NumberToRowUtil {
    fun numberToRow(a: Int, b: Int): Array<String?> {
        var result = Array<String?>(b) {null}
        var row = a
        for (i in 0..b-1){
            var number = ('A'.code + row - 1).toChar()
            result[i] = number.toString()
            row++
        }
        return result
    }
}
