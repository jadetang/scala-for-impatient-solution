package chap10


trait RectangleLike {
  def translate(x: Int, y: Int): Unit = {
    println("empty implement translate")
  }

  def grow(x: Int, y: Int) = {
    println("empty implement grow")
  }
}

object main1 {
  def main(args: Array[String]) {
    val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    egg.translate(10, -10)
    egg.translate(10, 20)
  }
}