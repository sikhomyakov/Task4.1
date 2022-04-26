package ru.netology

import org.junit.Test

import org.junit.Assert.*


class MainKtTest {

    @Test
    fun commissionCalculateMaestro() {
        //arrage
        val cardType = "Maestro"
        val amountTransfersThisMonth = 75_000
        val amountTransfer = 60_000
        //act
        val result = commissionCalculate(cardType, amountTransfersThisMonth, amountTransfer)
        //assert
        assertEquals(0, result)
    }

    @Test
    fun commissionCalculateVisa() {
        //arrage
        val cardType = "Visa"
        val amountTransfersThisMonth = 75_000
        val amountTransfer = 60_000
        //act
        val result = commissionCalculate(cardType, amountTransfersThisMonth, amountTransfer)
        //assert
        assertEquals(45000, result)
    }

    @Test

    fun limitsCheck() {
        val cardType = "Maestro"
        val amountTransfersThisMonth = 75_000
        val amountTransfer = 60_000
        //act
        val result = limitsCheck(cardType, amountTransfersThisMonth, amountTransfer)
        //assert
        assertEquals(0, result)
    }
}

