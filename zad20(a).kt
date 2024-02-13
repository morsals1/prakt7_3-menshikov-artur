import kotlin.math.*
fun main(){
    try{
        println("введите x")
        var x = readLine()!!.toDouble()
        var y = 0.0
        when{
            (x > -1 && x<1) -> y = x.pow(2)*(-1)
            (x > 1) -> y = x
        }
    } catch (e:Exception) { println("неверный формат ввода") }
}