package chap10


trait CaesarLogger {
  val shift = 3

  def log(msg: String) = {
    Console.println(msg.map((x: Char) => (x + shift).toChar))
  }
}

class Simple extends CaesarLogger{
  def work(msg:String){
    log(msg)
  }
}

object main4{
  def main(args: Array[String]) {
    val s = new Simple
    s.work("abc")

    val m = new {override val shift = 5} with Simple
    m.work("abc")

  }
}