package chap6


class Origin extends java.awt.Point{

}

object main3{
  def main(args: Array[String]) {
    val o = new Origin
    o.setLocation(5,6)
    println(o.getLocation)
  }
}
