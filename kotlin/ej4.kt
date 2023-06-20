fun main() {
    println("Tabla de Multiplicar")

    println("Ingrese un número entero:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        println("Tabla de multiplicar del número $numero:")
        for (i in 1..10) {
            val resultado = numero * i
            println("$numero x $i = $resultado")
        }
    } else {
        println("Error: Entrada inválida.")
    }
}
