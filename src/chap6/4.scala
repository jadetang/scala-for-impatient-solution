package chap6

class Point(private val x:Int,private val y:Int){
  override def toString = "["+x+","+y+"]"
}

object Point{
  def apply(x:Int,y:Int) = new Point(x,y)
}

object main4{
  def main(args: Array[String]) {
    val p = Point(3,4)
    println(p)
  }
}