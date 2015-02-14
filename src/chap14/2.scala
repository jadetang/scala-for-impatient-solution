package chap14


object main2 {
  def main(args: Array[String]) {
    def swap(x: (Int, Int)) = x match {
      case (x, y) => (y, x)
    }
    val x = (5,3)
    println(swap(x))
  }
}