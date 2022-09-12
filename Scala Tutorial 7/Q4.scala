object Q4 extends App {

    var bank:List[Account] = List()

    def accCreate(nic:String, accId: Int):Unit = {
        val acc = new Account(nic, accId)
        bank = bank ::: acc :: Nil
    }

    val find = (a:Int, b:List[Account]) => b.filter(account => account.accId.equals(a))
    val negBalance = (b:List[Account]) => b.filter(account => account.balance < 0.0)
    
    //traverse from left to right of list
    val totalBalance = (b:List[Account]) => b.foldLeft(0.0)((x, y) => x + y.balance)
    val interest = (b:List[Account]) => b.map(account => if(account.balance > 0) account.balance*0.05 else account.balance*0.1)

    
    //create accounts
    accCreate("1",1)
    accCreate("2",2)

    //deposit money
    find(1, bank)(0).deposit(1000)
    println(find(1, bank)(0))

    //transfer money
    find(1, bank)(0).transfer(2, 100.0)
    println(find(2, bank)(0))

    //list of negative balances
    println(negBalance(bank))

    //sum of all account balances
    println(totalBalance(bank))

    //final balances of all accounts after apply the interest
    println(interest(bank))
}

class Account(nic:String, val accId: Int, var balance: Double = 0.0){

    def withdrow(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(account:Int, amount:Double) : Unit = {

        val transferAcc = Q4.find(account, Q4.bank)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "["+nic+":"+accId +":"+ balance+"]"
}