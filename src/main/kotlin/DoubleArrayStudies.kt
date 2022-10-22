fun main() {
    val salaries = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val increase = 1.1

    //---------------------------------------------------------
    for (indices in salaries.indices){
        salaries[indices] = salaries[indices] + increase
    }
    println(salaries.contentToString())

    //---------------------------------------------------------
    salaries.forEachIndexed{ i, salary ->
        salaries[i] = salary * increase
    }
    println(salaries.contentToString())
}