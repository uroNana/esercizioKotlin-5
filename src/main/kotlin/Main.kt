//Write an extension method that filters a list by value (e.g. smaller than 500).
// Write an extension method that prints list values. Then create a list that
// that has at least 10 members, filter them and then print the values that pass the filter.

fun List<Int>.filterList(value: Int): List<Int> {
    return this.filter { it < value }
}

fun List<Int>.printList() {
    this.forEach { println("List value filtered: $it") }
}

fun main() {
    val list = listOf(5, 3, 4, 30, 40, 50, 300, 500, 600, 5000)
    val filteredList = list.filterList(500)
    filteredList.printList()
}
