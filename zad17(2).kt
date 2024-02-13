import kotlin.math.abs

fun main(){
    try{
        println("введите координаты вершин прямоугольник")
        println("пример: t1(x,y)")

        println(" сначала должны идти верхние координаты a -> b; потом нижние координаты d -> c")

        println("первая координата a")
        var ax = readLine()!!.toDouble()
        var ay = readLine()!!.toDouble()
        println("вторая координата b")
        var bx = readLine()!!.toDouble()
        var by = readLine()!!.toDouble()
        println("третья координата c")
        var cx = readLine()!!.toDouble()
        var cy = readLine()!!.toDouble()
        println("четвертая координата d")
        var dx = readLine()!!.toDouble()
        var dy = readLine()!!.toDouble()


        when{
            (bx > ax && cx>dx && ay > dy && by>cy ) -> {

                var ab = ax - bx
                var cd = dx - cx
                var ad = ay - dy
                var bc = by - cy
                var s = ab*ad
                println("плошадь части лежащего в 1 четверти прямоугольника S = ${String.format("%.2f", abs(s))}")
                if (ab == cd && ad == bc){
                    when{
                        (ax >= 0 && dy >= 0) -> {
                            ab = ab
                            cd = cd
                            ad = ad
                            bc = bc

                            s = ab*ad
                            println("плошадь части лежащего в 1 четверти прямоугольника S = ${String.format("%.2f", abs(s))}")
                        }
                        (ax >= 0 && dy < 0) -> {
                            ab = ab
                            cd = cd
                            ad = ad - dy
                            bc = bc - cy
                            s = ab*ad
                            println("плошадь части лежащего в 1 четверти прямоугольника S = ${String.format("%.2f", abs(s))}")
                        }
                        (bx > 0 && ax < 0 && dy >= 0) -> {
                            ab = ab - ax
                            cd = cd - dx
                            ad = ad
                            bc = bc
                            s = ab*ad
                            println("плошадь части лежащего в 1 четверти прямоугольника S = ${String.format("%.2f", abs(s))}")
                        }
                        (bx > 0 && ax < 0 && dy < 0) -> {
                            ab = ab - ax
                            cd = cd - dx
                            ad = ad - dy
                            bc = bc - cy
                            s = ab*ad
                            println("плошадь части лежащего в 1 четверти прямоугольника S = ${String.format("%.2f", abs(s))}")
                        }
                    }
                }
                else{ println("не прямоугольник") }
            }
            else -> { println("не прямоугольник") }
        }

    } catch (e:Exception) { println("неверный формат ввода") }
}