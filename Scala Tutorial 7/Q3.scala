object Q3 extends App {
    var bank:List[Account] = List()

    def accCreate(nic:String, accId: Int):Unit = {
        val acc = new Account(nic, accId)
        bank = bank ::: acc :: Nil
    }

    val find = (a:Int, b:List[Account]) => b.filter(account => account.accId.equals(a))

    
    accCreate("10896789",1)
    accCreate("25678524",2)

    //deposit money
    find(1, bank)(0).deposit(1000)
    println("Balance Acc 1 before transfer "+find(1, bank)(0).balance)

    //transfer money
    find(1, bank)(0).transfer(2, 200.0)
    println("Balance Acc 1 after transfer "+find(1, bank)(0).balance)
}

class Account(nic:String, val accId: Int, var balance: Double = 0.0){

    def withdrow(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(account:Int, amount:Double) : Unit = {
        
        val transferAcc = Q3.find(account, Q3.bank)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

}