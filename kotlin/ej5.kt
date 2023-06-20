fun main() {
    println("Factorial de un número")

    println("Ingrese un número entero positivo:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero >= 0) {
        val factorial = calcularFactorial(numero)
        println("El factorial de $numero es: $factorial")
    } else {
        println("Error: Entrada inválida.")
    }
}

fun calcularFactorial(n: Int): Long {
    var factorial: Long = 1
    for (i in 1..n) {
        factorial *= i.toLong()
    }
    return factorial
}
