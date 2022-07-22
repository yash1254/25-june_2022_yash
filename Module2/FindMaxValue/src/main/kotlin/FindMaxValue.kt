import java.util.Scanner

fun main(args:Array<String>){
    var sc =Scanner(System.`in`)

    var num1:Int
    var num2:Int
    var num3:Int

    println("Enter num 1:")
    num1=sc.nextInt()

    println("Enter num 2:")
    num2=sc.nextInt()

    println("Enter num 3:")
    num3=sc.nextInt()

    if (num1 > num2)
    {
        if (num1>num3)
        {
            println("numb1 is gretter")
        }else
        {
            println("num 3 is gretter")
        }
    }else
    {
        if (num2>num3)
        {
         println("number 2 is gretter")

        }
        else{
            println("number3 is gretter")
        }
    }
}