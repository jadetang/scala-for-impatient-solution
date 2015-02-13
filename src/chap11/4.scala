package chap11


class Money private (d: Int, c: Int) {
  private val dollar: Int = d + c / 100
  private val cent: Int = c % 100

  def +(that: Money): Money = new Money(this.dollar + that.dollar, this.cent + that.cent)

  def -(that: Money): Money = new Money(this.dollar - that.dollar, this.cent - that.cent)

  override def toString():String = "%d dollar %d cents".format(dollar,cent)

}

object Money{
  def apply(d:Int,c:Int) :Money = new Money(d,c)
}


object main4{
  def main(args: Array[String]) {
    val m = Money(1,2) + Money(3,8)
    println(m)
    val m2 = Money(3,8) - Money(2,6)
    println(m2)
  }
}
