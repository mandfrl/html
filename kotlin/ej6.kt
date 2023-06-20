
fun main() {
    println("Ingrese un número entero positivo:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero > 0) {
        var suma = 0
        for (i in 2..numero step 2) {
            suma += i
        }
        println("La suma de los números pares desde 1 hasta $numero es: $suma")
    } else {
        println("Número inválido. Inténtelo de nuevo con un número entero positivo.")
    }
}
