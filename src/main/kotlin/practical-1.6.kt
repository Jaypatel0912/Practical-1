fun main(){
    println("Enter any 2 Number :")
    var a:Int= readLine()!!.toInt()
    var b:Int=readLine()!!.toInt()
//    println("Enter number for :\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division :")
//    var o:Int= readLine()!!.toInt()
    println("Addition is ${Add(a,b)}")
    println("Subtraction is ${Sub(a,b)}")
    println("Multiplication is ${multi(a,b)}")
    println("Division is ${div(a,b)}")
}
fun Add(a:Int,b:Int):Int{
    var add= a+b
    return add
}
fun Sub(a:Int,b:Int):Int{
    var sub = a-b
    return sub
}
fun multi(a:Int,b:Int):Int{
    var multi = a*b
    return multi
}
fun div(a:Int,b:Int):Int{
    var div = a/b
    return div
}