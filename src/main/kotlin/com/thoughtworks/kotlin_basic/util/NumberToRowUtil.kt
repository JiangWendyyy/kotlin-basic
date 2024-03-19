package com.thoughtworks.kotlin_basic.util

class NumberToRowUtil {
    fun numberToRow(a: Int, b: Int): Array<String> {
        val resultArray = Array(b){ null.toString() }
        for(i in a..<a + b){
            if(i>18278)
                throw Exception("数据超出规定大小")
            val sb = StringBuilder()
            var number = i
            while (number > 0) {
                val remainder = (number - 1) % 26
                sb.append('A' + remainder)
                number = (number - 1) / 26
            }
            resultArray[i-a] = sb.reverse().toString()
        }
        return resultArray
    }
}
