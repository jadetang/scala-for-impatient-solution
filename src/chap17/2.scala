package chap17

class MutablePair[T](var left:T,var right:T){
  def swap() = {
    val temp = left
    left = right
    right = temp
  }

  override def toString():String = "("+left+","+right+")"
}


object main2{
  def main(args: Array[String]) {
    val x = new MutablePair("left","right")
    println(x)
    x.swap()
    println(x)
  }
}