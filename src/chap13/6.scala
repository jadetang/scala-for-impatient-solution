package chap13

object main6{
  def main(args: Array[String]) {
    val lst = List(1,2,3)
    val z = (List[Int]() /: lst)((x,y) =>y :: x)
    println(z)


  }
}