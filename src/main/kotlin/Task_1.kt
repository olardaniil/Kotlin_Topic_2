
fun main(array: Array<String>) {
    println("Введите двухзначное число:")
    var number: Int = readln().toInt();

    if ((number).toString().length == 2) {
        if ("7" in (number).toString()) {
            println("В введёном числе есть цифра 7")
        }
        else {
            println("В введёном числе нет цифры 7")
        }
    }
    else {
        println("Вы ввели неправильное число!")
    }
}