package chap14

object main10{
  def f(x:Double) = if( x>=0 ) Some(Math.sqrt(x)) else None

  def g(x:Double) = if( x!= 1) Some(1/(x-1)) else None


  def compose(f:(Double)=>Option[Double],g:(Double)=>Option[Double]) : Double=>Option[Double] ={
    (x: Double) => ( f(x) match {
      case Some(x) => g(x)
      case None => None
    }
      )
  }

  def main(args: Array[String]) {
    val h = compose(f, g)
    println(h(4))
    println(h(1))
    println(h(0))
  }
}