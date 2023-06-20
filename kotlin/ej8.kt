fun  esPrimo(numero: Int): Boolean {
    if (numero <= 1) {
        return false
    }

    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }

    return true
}

fun main() {
    println("Ingrese el número de inicio:")
    val inicio = readLine()?.toIntOrNull()

    println("Ingrese el número de fin:")
    val fin = readLine()?.toIntOrNull()

    if (inicio != null && fin != null && inicio < fin) {
        println("Números primos en el rango desde $inicio hasta $fin:")
        for (numero in inicio..fin) {
            if (esPrimo(numero)) {
                println(numero)
            }
        }
    } else {
        println("Entrada inválida. Asegúrese de ingresar dos números enteros donde el número de inicio sea menor que el número de fin.")
    }
}
