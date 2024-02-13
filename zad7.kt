import kotlin.math.*
fun main(){
    try {
        println("Введите сторону a")
        var a = readLine()!!.toDouble()
        println("Введите сторону b")
        var b = readLine()!!.toDouble()
        println("Введите сторону c")
        var c = readLine()!!.toDouble()
        var p = (a + b + c) / 2
        var s = sqrt(p * (p - a) * (p - b) * (p - c))
        println("s = ${String.format("%.2f",s)}")
    } catch (e:Exception) { println("неверный формат ввода") }
}