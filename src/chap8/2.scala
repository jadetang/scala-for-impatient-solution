package chap8

class SavingAccount(innitialBalance: Double, private val rate: Double, private val commission: Double = 1
                    , private val freeTransaction: Int = 3) extends BankAccount(innitialBalance) {
  private var transactionCount = 0

  def earnMonthlyInterest() = {
    transactionCount = 0
    super.deposit(balance*rate)
  }

  override def deposit(amount: Double) = {
    transactionCount += 1
    if (transactionCount > freeTransaction) {
      super.deposit(amount - commission)
    } else {
      super.deposit(amount)
    }
  }

  override def withdraw(amount: Double) = {
    transactionCount += 1
    if (transactionCount > freeTransaction) {
      super.withdraw(amount + commission)
    } else {
      super.withdraw(amount)
    }
  }
  /*override def toString(): String ={
    "Balance = %f".format(balance)
  }*/
}

object main8 {
  def main(args: Array[String]) {
    val sc = new SavingAccount(5000.0, 0.1)
    sc.earnMonthlyInterest()
    println("sc = " + sc)
    for( i <- 1 to 3){
      sc.deposit(50)
    }
    sc.deposit(51)
    println("sc = " + sc)
    sc.earnMonthlyInterest()
    sc.deposit(1)
    println("sc = " + sc)
  }
}