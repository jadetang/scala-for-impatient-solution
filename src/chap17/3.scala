package chap17

object main3{
  def swap[T,S](p:Pair[T,S]) = {
    new Pair(p.second,p.first)
  }

  def main(args: Array[String]) {
    val p1 = new Pair("string",1)
    println("p1 = " + p1)
    val p2 = swap(p1)
    println("p2 = " + p2)
  }


}