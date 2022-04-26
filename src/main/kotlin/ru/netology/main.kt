package ru.netology

fun main() {
    val cardType = "Vk Pay"
    val amountTransfersThisMonth = 0
    val amountTransfer = 100_000

    limitsCheck(cardType, amountTransfersThisMonth, amountTransfer)
}

fun commissionCalculate(cardType: String, amountTransfersThisMonth: Int, amountTransfer: Int): Int =
    when (cardType) {
        "Maestro", "MasterCard" -> {
            if (amountTransfersThisMonth <= 75_000) 0 else ((amountTransfer * 0.006 + 20) * 100).toInt()
        }
        "Visa", "Мир" -> {
            if (amountTransfer * 0.0075 > 35) ((amountTransfer * 0.0075) * 100).toInt() else 35 * 100
        }
        else -> 0
    }

fun limitsCheck(cardType: String, amountTransfersThisMonth: Int, amountTransfer: Int) {
    if (cardType == "Vk Pay" && (amountTransfersThisMonth > 40_000 || amountTransfer > 15_000)) {
        println("Превышен лимит переводов")
    } else if (amountTransfersThisMonth < 600_000 && amountTransfer < 150_000) {
        val commission = commissionCalculate(cardType, amountTransfersThisMonth, amountTransfer)
        println("Ваша комиссия составляет ${commission / 100} руб. ${commission % 100} коп.")
    } else {
        println("Превышен лимит переводов")
    }
}




