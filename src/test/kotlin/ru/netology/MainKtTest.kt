package ru.netology

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {
    @Test
    fun calculateCommission_VkPay() {
        val card = "VkPay"
        val transferAmount = 15_000
        val amountOfTransfersInCurrentMonth = 0
        val mastercardAndMaestroCommission = 0.06
        val visaAndMirCommission = 0.075

        val result = calculateCommission(
            card = card,
            transferAmount = transferAmount,
            amountOfTransfersInCurrentMonth = amountOfTransfersInCurrentMonth,
            mastercardAndMaestroCommission = mastercardAndMaestroCommission,
            visaAndMirCommission = visaAndMirCommission
        )
        assertEquals(result, 0)
    }

    @Test
    fun calculateCommission_MastercardAndMaestro() {
        val card = "Mastercard"
        val transferAmount = 15_000
        val amountOfTransfersInCurrentMonth = 80_000
        val mastercardAndMaestroCommission = 0.06
        val visaAndMirCommission = 0.075

        val result = calculateCommission(
            card = card,
            transferAmount = transferAmount,
            amountOfTransfersInCurrentMonth = amountOfTransfersInCurrentMonth,
            mastercardAndMaestroCommission = mastercardAndMaestroCommission,
            visaAndMirCommission = visaAndMirCommission
        )
        assertEquals(result, 92_000)
    }

    @Test
    fun calculateCommission_VisaAndMir() {
        val card = "Mir"
        val transferAmount = 15_000
        val amountOfTransfersInCurrentMonth = 80_000
        val mastercardAndMaestroCommission = 0.06
        val visaAndMirCommission = 0.075

        val result = calculateCommission(
            card = card,
            transferAmount = transferAmount,
            amountOfTransfersInCurrentMonth = amountOfTransfersInCurrentMonth,
            mastercardAndMaestroCommission = mastercardAndMaestroCommission,
            visaAndMirCommission = visaAndMirCommission
        )
        assertEquals(result, 112_500)
    }

    @Test
    fun calculateCommission_Else() {
        val card = "WithOutCard"
        val transferAmount = 15_000
        val amountOfTransfersInCurrentMonth = 80_000
        val mastercardAndMaestroCommission = 0.06
        val visaAndMirCommission = 0.075

        val result = calculateCommission(
            card = card,
            transferAmount = transferAmount,
            amountOfTransfersInCurrentMonth = amountOfTransfersInCurrentMonth,
            mastercardAndMaestroCommission = mastercardAndMaestroCommission,
            visaAndMirCommission = visaAndMirCommission
        )
        assertEquals(result, 0)
    }
}