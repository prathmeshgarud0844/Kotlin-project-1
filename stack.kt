fun printNextEvenNumber(n: Int) {
    val next = if (n % 2 == 0) n + 2 else n + 1
    println(next)
}

fun main(args: Array<String>) {
    val n = 78
    printNextEvenNumber(n)
}
