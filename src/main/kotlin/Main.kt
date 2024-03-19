import com.thoughtworks.kotlin_basic.util.NumberToRowUtil
import com.thoughtworks.kotlin_basic.util.PrintUtil

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    val printUtil = PrintUtil()
    val numberToRowUtil = NumberToRowUtil()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    val row = numberToRowUtil.numberToRow(1,19)
    val headers = row.toList()
    val rows = listOf(
        listOf("1", "Alice", "Software Engineer"),
        listOf("2", "Bob", "Data Scientist"),
        listOf("3", "Charlie", "Product Manager")
    )

    printUtil.printTable(headers, rows)
}
