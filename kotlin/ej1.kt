

fun main() {
    println("Ingrese un número entero:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        println("Num pares:")
        for (i in 2..numero step 2) {
            println(i)
        }

        println("Números impares:")
        for (i in 1..numero step 2) {
            println(i)
        }
    } else {
        println("Número inválido. Inténtelo de nuevo.")
    }
}
