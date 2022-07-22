import java.util.Scanner

fun main(args:Array<String>){

    val sc = Scanner(System.`in`)

    print("Enter a number: ")
    val num = sc.nextInt()

    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}