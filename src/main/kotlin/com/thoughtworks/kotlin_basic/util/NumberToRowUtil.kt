package com.thoughtworks.kotlin_basic.util

class NumberToRowUtil {
    fun numberToRow(a: Int, b: Int): Array<String?> {
        val resultArray = Array<String?>(b) {null}
        for(i in a..<a + b){
            var theLastCharInt = i
            var theMiddleCharInt:Int? = null
            if(i>26){
                theLastCharInt = i.div(26)
                theMiddleCharInt = a/26
            }
            var theLastChar: Char = intToChar(theLastCharInt)
            val theMiddleChar: Char? = theMiddleCharInt?.let { intToChar(it) }
            var resultString = theMiddleChar?.let { it.toString() + theLastChar.toString()} ?: theLastChar.toString()
            resultArray[i-a] = resultString
        }
        return resultArray
    }

    private fun intToChar(row: Int): Char {
        return ('A'.code + row - 1).toChar()
    }
}
