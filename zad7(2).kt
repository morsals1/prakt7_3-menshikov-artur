fun main(){
    try{
        println("введите трехзначное число")
        var a = readLine()!!.toInt()
        var a1 = a%10
        var a2 = a%100
        a2 = a2/10
        var a3 = a/100

        when{
            (a3 > 0 && a3<9) -> {
                println("a1 = ${a1} a2 = ${a2} a3 = ${a3}")
                var d = a2 - a1
                var a3n = a2 + d
                when{
                    (a3 == a3n ) -> println("цифры этого числа образуют арифметическую прогрессию")
                    else -> println("цифры этого числа не образуют арифметическую прогрессию")
                }
            }
            else -> println("введите трехзначное число!!!!!!")
        }
    } catch (e:Exception) { println("неверный формат ввода") }
}