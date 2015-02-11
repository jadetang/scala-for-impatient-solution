package chap8

abstract class Shape {
  def centerPoint: Point
}


class Rectangle(private val leftUp: Point, private val rightDown: Point) extends Shape {
  override def centerPoint: Point = new Point((leftUp.x + rightDown.x) / 2, (leftUp.y + rightDown.y) / 2)
}


class Circle(private val center:Point,private val radius:Double) extends Shape{
  override def centerPoint: Point = center
}



