package chap13


object main7 {
  def main(args: Array[String]) {
    def multi(t:(Double,Int)):Double = t._1*t._2

    val prices = List(5.0, 20.0, 9.95)
    val q = List(10, 2, 1)
    val result = (prices zip q).map{ multi(_) }
    val sum = result.sum
    println(sum)

  }
}