import java.util.*

class BankDetails {
    private var accno: String? = null
    private var name: String? = null
    private var acc_type: String? = null
    private var balance: Int = 0
    var sc: Scanner = Scanner(System.`in`)

    //method to open new account
    fun openAccount() {
        print("Enter Account No: ")
        accno = sc.next()
        print("Enter Account type: ")
        acc_type = sc.next()
        print("Enter Name: ")
        name = sc.next()
        print("Enter Balance: ")
        balance = sc.nextInt()
    }

    //method to deposit money
    fun deposit() {
        //val amt: Long
        val amt :Int
        println("Enter the amount you want to deposit: ")
        //amt = sc.nextLong()
        amt=sc.nextInt()
        balance = balance + amt
        println("Balance after Deposit: $balance")

    }

    //method to withdraw money
    fun withdrawal() {
        val amt: Int
        println("Enter the amount you want to withdraw: ")
        amt = sc.nextInt()
        if (balance >= amt) {
            balance = balance - amt
            println("Balance after withdrawal: $balance")
        } else {
            println("Your balance is less than $amt\tTransaction failed...!!")
        }
    }

}


fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)
    var bankDetails=BankDetails()

    // loop runs until number 4 is not pressed to exit
    var ch: Int
    do {
        println("1.Open New Account \n 2. Deposit the amount \n 3. Withdraw the amount\n 4.Exit ")
        println("Enter your choice: ")
        ch = sc.nextInt()
        when (ch) {

            1->{
                bankDetails.openAccount()
            }
            2 -> {
                bankDetails.deposit()

            }
            3 -> {
                bankDetails.withdrawal()

            }
            4 -> println("Thanks for Using This Application !")

        }

    } while (ch != 4)


}


