
class Time2(h: Int, m: Int) {
  private val minuteSinceMidNight = 60 * h + m

  def hour = minuteSinceMidNight / 60

  def minute = minuteSinceMidNight % 60

  def before(other: Time2): Boolean = minuteSinceMidNight < other.minuteSinceMidNight

  override def toString(): String = "[" + hour + ":" + minute + "]"
}


object main4 {
  def main(args: Array[String]) {
    val t = new Time2(23, 5)
    println(t)
  }
}