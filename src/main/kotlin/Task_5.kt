fun main() {

    println("Сколько лет клиенту?")
    var age: Int = readln().toInt();

    while (age < 18) {
        println("Клиенту, которого вы хотите поздравить ещё нет 18-ти лет. \nВыберите нового клиента.")
        println("Сколько лет клиенту?")
        age = readln().toInt();
    }

    println("Как зовут клиента?")
    var fill_name: String = readln().toString();
    println("Это М или Ж?")
    var gender: String = readln().toString();


    if (age % 5 == 0) {
        if (gender == "М") {
            println("Уважаемый, $fill_name. Поздравляю с Юбилеем. Желаю ВСЕ-ГО ХО-РО-ШЕ-ГО!!!")
        } else {
            println("Уважаемая, $fill_name. Поздравляю с Юбилеем. Желаю ВСЕ-ГО ХО-РО-ШЕ-ГО!!!")
        }

    } else {
        if (gender == "М") {
            println("Уважаемый, $fill_name. Поздравляю с Днём Рождения. Желаю ВСЕ-ГО ХО-РО-ШЕ-ГО!!!")
        } else {
            println("Уважаемая, $fill_name. Поздравляю с Днём Рождения. Желаю ВСЕ-ГО ХО-РО-ШЕ-ГО!!!")
        }
    }
}