

class Time(private var h: Int = 0, private var m: Int = 0) {

  def hours = h

  def minutes = m

  def before(other: Time) = h * 60 + m < other.h * 60 + other.m

}


object main3 {
  def main(args: Array[String]) {
    val t1 = new Time(21, 1)
    val t2 = new Time(22, 2)
    println(t1.before(t2))
  }
}