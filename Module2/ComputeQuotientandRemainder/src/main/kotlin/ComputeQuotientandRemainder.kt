import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    println("Enter dividend:")
    val dividend = sc.nextInt()

    println("Enter divisor:")
    val divisor = sc.nextInt()

    val quotient = dividend / divisor
    val remainder = dividend % divisor

    println("Quotient = $quotient")
    println("Remainder = $remainder")

}