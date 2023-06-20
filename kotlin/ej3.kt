
fun main() {
    println("Verificación de número primo")

    println("Ingrese un número entero:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero > 1) {
        val esPrimo = esPrimo(numero)
        if (esPrimo) {
            println("$numero es un número primo.")
        } else {
            println("$numero no es un número primo.")
        }
    } else {
        println("Error: Entrada inválida.")
    }
}

fun esPrimo(numero: Int): Boolean {
    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }
    return true
}
