import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun commission() {
        val typeCard = 2 // 1 - VKpay 2 - Visa Мир 3 - Master Maestro
        val sum = 30
        var sumOverallVK = 0
        var sumOverallCard = 0 // Общая сумма переводов для всех карт

        val result = commission(typeCard, sumOverallCard, sum)
        assertEquals(28, result)
    }
}