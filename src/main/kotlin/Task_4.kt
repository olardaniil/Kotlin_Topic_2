fun main() {
    println("Введите сумму заказа:")
    var sum_z: Int = readln().toInt();

    if (sum_z.toString()[sum_z.toString().length.toInt()-1] == '0' || sum_z.toString()[sum_z.toString().length.toInt()-1] == '5' || sum_z.toString()[sum_z.toString().length.toInt()-1] == '6' || sum_z.toString()[sum_z.toString().length.toInt()-1] == '7' || sum_z.toString()[sum_z.toString().length.toInt()-1] == '8' || sum_z.toString()[sum_z.toString().length.toInt()-1] == '9') {
        println("Сумма заказа: ${sum_z.toString()} рублей")
    } else if (sum_z.toString()[sum_z.toString().length.toInt()-1] == '1') {
        println("Сумма заказа: ${sum_z.toString()} рубль")
    } else if (sum_z.toString()[sum_z.toString().length.toInt()-1] == '2' || sum_z.toString()[sum_z.toString().length.toInt()-1] == '3' || sum_z.toString()[sum_z.toString().length.toInt()-1] == '4') {
        println("Сумма заказа: ${sum_z.toString()} рубля")
    }
}