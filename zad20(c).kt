fun main() {
    println("введите x")
    var x = readln()!!.toDouble()
    //20c
    when {
        x < 0 -> x = 0.0
        x in 0.0..2.0 -> x = 1.0
        else -> x = 2.0
    }
    println("Значение функции C при x = 1.5: $x")
}