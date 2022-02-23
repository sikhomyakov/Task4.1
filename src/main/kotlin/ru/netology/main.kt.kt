package ru.netology

fun main() {

    println(limitsCheck("Vk Pay", 0, 54670))
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
    if (cardType == "Vk Pay" && (amountTransfer > 15000 || amountTransfersThisMonth > 40000)) {
        println("Проевышен лимит переводов")
    }
    else if (amountTransfer <= 150000 || amountTransfersThisMonth <= 600000) {
        val commission = commissionCalculate(cardType, amountTransfersThisMonth, amountTransfer)
        println("Ваша комиссия составляет ${commission / 100} руб. ${commission % 100} коп.")
    }
}



