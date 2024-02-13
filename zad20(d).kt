fun main() {
    println("введите x")
    var x = readln()!!.toDouble()
    //20d
    when {
        x < 1 -> x = 1.0
        else -> x = x
    }
    println("Значение функции D при x = 0.5: $x")
}