fun main() {

    var number: Int = readln().toInt();

    var st: Int = readln().toInt();

    var fn: Int = readln().toInt();

    if ((st >= number && number >= fn).not()) {
        println("Число в диапозоне")
    }
    else {
        println("Число не в диапозоне")
    }
}