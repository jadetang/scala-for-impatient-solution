package chap8

class BankAccount(initialBalance: Double) {
  private var _balance = initialBalance

  def deposit(amount: Double) = {
    _balance += amount
    _balance
  }

  def withdraw(amount: Double) = {
    _balance -= amount
    _balance
  }

  override def toString = "Balance = %f".format(_balance)

  def balance = _balance
}


class CheckingAccount(initialBalance: Double, private val commission: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = super.deposit(amount - commission)

  override def withdraw(amount: Double) = super.withdraw(amount + commission)
}

object main1{
  def main(args: Array[String]) {
    val account = new CheckingAccount(50,1)
    account.deposit(50)
    println("account = " + account)
  }
}



