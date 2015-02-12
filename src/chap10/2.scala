package chap10
import java.awt.Point

class OrderedPoint extends Point with scala.math.Ordered[Point]{
  override def compare(that: Point): Int = {
    if(this.x == that.x && this.y == this.y){
      0
    }else if(this.x < that.x){
      -1
    }else if(Math.sqrt(this.x) == Math.sqrt(that.x) && this.y < Math.sqrt(that.y)){
      -1
    }else{
      1
    }
  }
}