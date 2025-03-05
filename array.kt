fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()


    if (numbers.isNotEmpty()) {
        val temp = numbers[0]
        numbers[0] = numbers[numbers.size - 1]
        numbers[numbers.size - 1] = temp
    }

    // Do not touch lines below
    println(numbers.joinToString(separator=" "))
}
