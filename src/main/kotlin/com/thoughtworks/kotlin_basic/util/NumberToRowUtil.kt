package com.thoughtworks.kotlin_basic.util

import com.sun.org.apache.xpath.internal.operations.Variable

class NumberToRowUtil {
    fun numberToRow(a: Int, b: Int): Array<String?> {
        val resultArray = Array<String?>(b) {null}
        for(i in a..<a + b){
            if(i<=26)
                resultArray[i-a] = intToChar(i%26).toString()
            if(i>26 && i<702)
                resultArray[i-a] = intToChar(i).toString() +intToChar(i%26).toString()
            if(i == 702)
                resultArray[i-a] = "ZZ"
            if(i>702 && i<=18278)
                resultArray[i-a] = intToChar(i-672).toString()+intToChar(i-672).toString() +intToChar(i%26).toString()
            if(i>18278)
                throw Exception("数据超出规定大小")
        }
        return resultArray
    }

    private fun intToChar(row: Int): Char {
        if(row==0)
            return 'Z'
        var a = row
        while(a>26) {
            a /= 26
        }
        return ('A'.code + a -1).toChar()
    }
}
