package br.com.primeiroprogramakotlin

fun main() {

    var z :Int

    fun sum(x:Int,y:Int) = x.plus(y)


    println(sum(1,3))

    fun calculate(a:Int,b:Int,operation:(Int,Int)->Int):Int{

        var result = operation(a,b)
        return result
    }

    z = calculate(10,20){x,y -> x+y}
    println(z)
}
