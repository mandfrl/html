fun main() {
    println("Calculadora Simple")

    println("Ingrese el primer número:")
    val num1 = readLine()?.toIntOrNull()

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toIntOrNull()

    println("Ingrese el operador (+, -, *, /):")
    val operator = readLine()

    if (num1 != null && num2 != null && operator != null) {
        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0) {
                    num1.toDouble() / num2.toDouble()
                } else {
                    println("Error: No se puede dividir entre cero.")
                    return
                }
            }
            else -> {
                println("Error: Operador inválido.")
                return
            }
        }
        println("Resultado: $result")
    } else {
        println("Error: Entrada inválida.")
    }
}
