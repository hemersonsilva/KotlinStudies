fun main() {
    val ages = intArrayOf(10, 15, 25, 19, 33, 20, 40)
    println(ages.max())
    println(ages.min())
    println(ages.average())//média

    val todosMaiores = ages.all { it >= 18 }
    println(todosMaiores)

    val existeMaior = ages.any { it >= 18 }
    println("Algun aluno é maior de idade? $existeMaior")

    val maiores = ages.filter { it>= 18 }
    println("Maiores: $maiores")

    val busca = ages.find { it > 25 }
    println("Busca: $busca")
}