package chap14

object main5 {
  def main(args: Array[String]) {

    def count(tree: List[Any]): Int = {
      (for (node <- tree) yield (
        node match {
          case a: Int => a
          case l: List[Int] => count(l)
        }
        )).sum
    }

    val tree = List(List(3, 8), 2, List(5))
    println(count(tree))
  }

}