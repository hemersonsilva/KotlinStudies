fun main() {

    val range = 1.rangeTo(10)
    for (r in range) {
        print("$r ")
    }
    println()

    //---------------------------------------------------------
    val pares = 0..100 step 2
    for (p in pares) {
         print("$p ")
    }
    println()

    //---------------------------------------------------------
    val pares2 = 0.until(100) step 2
    for (p in pares2) {
        print("$p ")
    }
    println()
    //---------------------------------------------------------
    val paresReversos = 100 downTo 0 step 2
    paresReversos.forEach { print("$it ") }
    println()

    //---------------------------------------------------------
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo)
        print("Está dentro do intervalo")
    else
        print("Não está dentro do intervalo")
    println()

    //---------------------------------------------------------
    val alfabeto = 'a'..'d'
    val letra = 'k'
    print(letra in alfabeto)


}