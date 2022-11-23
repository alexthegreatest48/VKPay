import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun commission() {
        var typeCard = 2 // 1 - VKpay 2 - Visa Мир 3 - Master Maestro
        var sum = 30
        var sumOverallVK = 0
        var sumOverallCard = 0 // Общая сумма переводов для всех карт
        var result = commission(typeCard, sumOverallCard, sum)
        assertEquals(30, result)

        typeCard = 2
        sum = 150001
        sumOverallVK = 0
        sumOverallCard = 0
        result = commission(typeCard, sumOverallCard, sum)
        assertEquals(0, result)

        typeCard = 2
        sum = 10
        sumOverallVK = 0
        sumOverallCard = 599999
        result = commission(typeCard, sumOverallCard, sum)
        assertEquals(0, result)

        typeCard = 1
        sum = 10000
        sumOverallVK = 30001
        sumOverallCard = 0
        result = commission(typeCard, sumOverallVK, sum)
        assertEquals(0, result)

        typeCard = 1
        sum = 16000
        sumOverallVK = 0
        sumOverallCard = 0
        result = commission(typeCard, sumOverallVK, sum)
        assertEquals(0, result)

        typeCard = 1
        sum = 1500
        sumOverallVK = 20000
        sumOverallCard = 0
        result = commission(typeCard, sumOverallVK, sum)
        assertEquals(sum, result)

        typeCard = 3
        sum = 150001
        sumOverallVK = 0
        sumOverallCard = 0
        result = commission(typeCard, sumOverallCard, sum)
        assertEquals(0, result)

        typeCard = 3
        sum = 1500
        sumOverallVK = 0
        sumOverallCard = 599999
        result = commission(typeCard, sumOverallCard, sum)
        assertEquals(0, result)

        typeCard = 3
        sum = 1500
        sumOverallVK = 0
        sumOverallCard = 0
        result = commission(typeCard, sumOverallCard, sum)
        assertEquals(1500, result)
    }
}