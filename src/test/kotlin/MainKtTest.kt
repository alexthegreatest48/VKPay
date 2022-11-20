import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun commission() {
        val typeCard = 2 // 1 - VKpay 2 - Visa ��� 3 - Master Maestro
        val sum = 30
        var sumOverallVK = 0
        var sumOverallCard = 0 // ����� ����� ��������� ��� ���� ����

        val result = commission(typeCard, sumOverallCard, sum)
        assertEquals(28, result)
    }
}