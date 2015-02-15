package chap17

class Pair[T,S](val first:T,val second:S){
  def swap[T,S]() = new MutablePair(second,first)

  override def toString():String = "("+first+","+second+")"

}

object main1{
  def main(args: Array[String]) {
    val p1 = new MutablePair("string",1)
    val p2 = p1.swap()
  }
}