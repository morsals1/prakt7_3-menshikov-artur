fun main() {
    println("введите x")
    var x = readln()!!.toDouble()
    //20b
    when {
        x < 1 -> x = -1.0
        x in 1.0..3.0 -> x = x - 2
        else -> x = 1.0
    }
    println("Значение функции B при x = 2.5: $x")
}