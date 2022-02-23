package ru.netology

fun main() {
    val cardType = "Visa"
    val amountTransfersThisMonth = 500000
    val amountTransfer = 15000

    limitsCheck(cardType, amountTransfersThisMonth, amountTransfer)
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
    if (cardType == "Vk Pay" && (amountTransfersThisMonth > 40000 || amountTransfer > 15000)) {
        println("Превышен лимит переводов")
    } else if (amountTransfersThisMonth < 600000 && amountTransfer < 150000) {
        val commission = commissionCalculate(cardType, amountTransfersThisMonth, amountTransfer)
        println("Ваша комиссия составляет ${commission / 100} руб. ${commission % 100} коп.")
    } else {
        println("Превышен лимит переводов")
    }
}




