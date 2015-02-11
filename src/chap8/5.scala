package chap8


class Point(private val _x:Int,private val _y:Int){
  def x:Int = _x
  def y:Int = _y
}

class LabeledPoint(private val lable:String,x:Int,y:Int) extends Point(x,y){
  override def toString = "%s [%d,%d]".format(lable,x,y)
}


object main5{
  def main(args: Array[String]): Unit = {
    val p = new LabeledPoint("my labe",1,2)
    println(p)
  }
}