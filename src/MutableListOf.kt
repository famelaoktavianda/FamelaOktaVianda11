fun main(args: Array<String>) {
    //Mutablelist is a List with list-specific write operations
    val numbers = mutableListOf(1,2,3,4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

    val numbersStr = mutableListOf("one", "two", "three", "four")
    numbersStr.add("five") //this is ok
    //numbersStr = mutableListOf("six", "seven") // compilation error
    println(numbersStr)
}