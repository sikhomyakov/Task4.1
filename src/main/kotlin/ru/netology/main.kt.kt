package ru.netology

fun main() {
    val amountRub = 53460
    val minComissionRub = 35
    val penniesInRub = 100

    val amount = amountRub * penniesInRub
    val minComission = minComissionRub * penniesInRub
    val comission = amount * 0.0075
    val fullComission = if (comission < minComission) minComission  else comission
    println("Ваша комиссия составляет: ${fullComission.toInt() / 100} рублей ${fullComission.toInt() % 100} копеек")
}
