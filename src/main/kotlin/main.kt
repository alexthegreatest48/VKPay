fun main(){
    val typeCard = 1 // 1 - VKpay 2 - Visa ��� 3 - Master Maestro
    val sum = 1000
    var sumOverallVK = 0
    var sumOverallCard = 0 // ����� ����� ��������� ��� ���� ����

    when{
        typeCard == 1 -> sumOverallVK += commission(typeCard, sumOverallVK, sum)
        else -> sumOverallCard += commission(typeCard, sumOverallCard, sum)
    }

}

fun commission(typeCard: Int, sumOverall: Int, sum: Int): Int {
    var comis: Double
    if (typeCard == 1){
        if (sumOverall + sum >= 40000 || sum >= 15000) {
            println("������� �������� ��-�� ���������� ������")
            return 0
        } else {
            println("������� ��������")
            return sum
        }
    } else if (typeCard == 2) {
        if (sum >= 150000 || sumOverall +sum >= 600000){
            println("������� �������� ��-�� ���������� ������")
            return 0
        } else {
            println("������� ��������")
            comis = sum * 0.075
            if (comis < 35) println ("�������� 35 ������") else println("�������� $comis ������")
            return sum
        }
    } else if (typeCard == 3){
        if (sum >= 150000 || sumOverall +sum >= 600000){
            println("������� �������� ��-�� ���������� ������")
            return 0
        } else {
            println("������� ��������")
            comis = sum * 0.06 + 20
            if (sumOverall < 75000) println("�������� 0 ������") else println("�������� $comis ������")
            return sum
        }
    }
    return 0
}