
object Main{
    def main(args: Array[String]): Unit={
        println("-" * 162)

        code(args)
        
        println("-" * 162)
    }
    def code(args: Array[String]): Unit={
        class BankAccount(initialBalance:Int){
            var balance: Int = initialBalance

            def withdraw(amount:Int): Unit ={
                if(balance >= amount){
                    balance = balance - amount
                }else 
                    sys.error("Insufficient funds")
            }
            def getBalance: Int ={
                balance
            }     
            def deposit(amount:Int): Unit ={
                if(balance >= 1){
                    balance = balance + amount
                }else 
                    sys.error("It 's is only possible to deposit positive amount")
            }
        }

        val bankAccount1 = new BankAccount(initialBalance = 100)

        bankAccount1.withdraw(10)
        println(bankAccount1.getBalance)

        bankAccount1.withdraw(15)
        println(bankAccount1.getBalance)

        println()

        bankAccount1.deposit(125)
        println(bankAccount1.getBalance)

        def makeTransfer(from:BankAccount, amount:Int, to: BankAccount):Unit = {
            def showBothAccount():Unit = {
                println(s"from : ${from.getBalance}")
                println(s"from : ${to.getBalance}")
            }
            println("before")
            showBothAccount()

            from.withdraw(amount)
            to.deposit(amount)

            println()

            println("after")
            showBothAccount()
            println(s"${amount}")
        }
        val  firstBankAccount: BankAccount = new BankAccount(initialBalance = 50)
        val secondBankAccount: BankAccount = new BankAccount(initialBalance = 15)
        makeTransfer(from= firstBankAccount, 20, to= secondBankAccount)
    }

}