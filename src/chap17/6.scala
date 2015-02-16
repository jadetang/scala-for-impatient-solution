package chap16

object main6{
  def middle[T](it:Iterable[T]):T ={
    val list = it.toList
    list(list.length/2)
  }
  def main(args: Array[String]) {
    val str = "world"
    println(middle(str))
  }
}