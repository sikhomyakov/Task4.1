package ru.netology

fun main() {

    println(commissionCalculate("Visa", 0, 5467))
}

fun commissionCalculate(cardType: String, amountTransfersThisMonth: Int, amountTransfer: Int): Int =
    when (cardType) {
        "Maestro", "MasterCard" -> {
            if (amountTransfersThisMonth <= 75000) 0 else ((amountTransfer * 0.006 + 20) * 100).toInt()
        }
        "Visa", "Мир" -> {
            if (amountTransfer * 0.0075 > 35) ((amountTransfer * 0.0075) * 100).toInt() else 35 * 100
        }
        else -> 0
    }

fun limitsCheck(cardType: String, amountTransfersThisMonth: Int, amountTransfer: Int) {


}



