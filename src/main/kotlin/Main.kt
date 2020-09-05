package ru.netology

fun main() {

    val card = "VkPay"
    val transferAmount = 15_000
    val amountOfTransfersInCurrentMonth = 0
    val mastercardAndMaestroCommission = 0.06
    val visaAndMirCommission = 0.075

    validationCheck(card,
        transferAmount,
        amountOfTransfersInCurrentMonth,
        mastercardAndMaestroCommission,
        visaAndMirCommission)
}

fun validationCheck(
    card: String,
    transferAmount: Int,
    amountOfTransfersInCurrentMonth: Int,
    mastercardAndMaestroCommission: Double,
    visaAndMirCommission: Double

) {
    if (card == "VkPay" && (transferAmount > 15_000 || amountOfTransfersInCurrentMonth > 40_000)) {
        println("Перевод невозможен! Превышен лимит!")
    } else if (transferAmount < 150_000 && amountOfTransfersInCurrentMonth < 600_000) {
        val commission = calculateCommission(card,
            transferAmount,
            amountOfTransfersInCurrentMonth,
            mastercardAndMaestroCommission,
            visaAndMirCommission)
        println("Комиссия с вашего перевода составит: $commission коп.")
    }
}

fun calculateCommission(card: String,
                        transferAmount: Int,
                        amountOfTransfersInCurrentMonth: Int,
                        mastercardAndMaestroCommission: Double,
                        visaAndMirCommission: Double): Int =

    when (card) {
        "VkPay" -> 0
        "Mastercard", "Maestro" -> {
            if (amountOfTransfersInCurrentMonth <= 75_000) 0 else ((transferAmount * mastercardAndMaestroCommission + 20) * 100).toInt()
        }
        "Visa", "Mir" -> {
            ((transferAmount * visaAndMirCommission) * 100).toInt()
        }
        else -> 0
    }