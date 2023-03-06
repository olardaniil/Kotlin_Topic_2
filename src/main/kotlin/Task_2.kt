fun main() {

    println("Введите трёхзначное число:")
    var number: String = readln().toString();

    if ((number).length == 3) {
        if ("4" in number && "6" in number) {
            println("В введеном числе есть цифры 4 и 6.")
        }
        else {
            println("В введеном числе нет цифр 4 и 6.")
        }
    }
    else {
        println("Вы ввели неправильное число!")
    }
}