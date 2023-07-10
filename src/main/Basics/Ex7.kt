fun getAverage(list: List<Int>): Double {
    val stats = list.stream()
        .mapToInt { it }
        .summaryStatistics()
    return stats.average
}

fun main() {
    val list = listOf(5345, 76547, 432, 534, 564, 76, 54, 43, 65, 5421)
    val avg = getAverage(list)
    println(avg)
}