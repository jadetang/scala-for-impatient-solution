package chap14

object main9{
  def main(args: Array[String]): Unit = {
    def sum(lst: List[Option[Int]]) = lst.map(_.getOrElse(0)).sum
    val x = List(Some(1), None, Some(2), None, Some(3))
    println(sum(x))
  }
}