fun main() {
    println("Cálculo de los primeros n números de la serie Fibonacci")

    println("Ingrese la cantidad de números de la serie Fibonacci que desea calcular:")
    val cantidad = readLine()?.toIntOrNull()

    if (cantidad != null && cantidad > 0) {
        val serieFibonacci = calcularSerieFibonacci(cantidad)
        println("Los $cantidad primeros números de la serie Fibonacci son: $serieFibonacci")
    } else {
        println("Error: Cantidad inválida.")
    }
}

fun calcularSerieFibonacci(n: Int): String {
    var num1 = 1
    var num2 = 1
    var serie = "$num1, $num2"

    for (i in 3..n) {
        val nextNum = num1 + num2
        serie += ", $nextNum"
        num1 = num2
        num2 = nextNum
    }

    return serie
}
