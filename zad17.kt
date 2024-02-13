fun main(){
    try{
        println("введите скорость лодки")
        var v = readLine()!!.toInt()
        println("введите скорость течения реки")
        var u = readLine()!!.toInt()
        println("введите время движения по озеру")
        var t1 = readLine()!!.toInt()
        println("введите время движения против течению")
        var t2 = readLine()!!.toInt()
        when{
            (v>u) -> {var s1 = v*t1
                var s2 = (v-u)*t2
                var so = s1+s2
                println("S по течение = ${s1}; S против течения = ${s2}; общее S = ${so}")}
            else -> println("скорость лодки должна быть боьше скорости течения реки")
        }
    } catch (e:Exception) { println("неверный формат ввода") }
}