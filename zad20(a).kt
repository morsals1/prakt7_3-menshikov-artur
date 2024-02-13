fun main(){
    println("введите x")
    var x = readln()!!.toDouble()
    //20a
    when {
        x < 0 -> x = 0.0
        x in 0.0..1.0 -> x = 1.0
        else -> x = x - 1
    }
    println("Значение функции A при x = 1.5: $x")
}