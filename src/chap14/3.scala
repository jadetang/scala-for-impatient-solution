package chap14

object main3 {
  def main(args: Array[String]) {
    def swap(array: Array[Int]) = array match {
      case Array(x, y, tail@_*) => Array(y, x) ++ tail
      case _ => array
    }

    val x = Array(0,1,2)
    println(swap(x).mkString(" "))
  }
}