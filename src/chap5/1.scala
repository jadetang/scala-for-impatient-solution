class Counter(private var value:BigInt = 0){
  def increment() = value+=1
  def current() = value
}

object main1 {
  def main(args: Array[String]) {
    val c = new Counter(Int.MaxValue-1)
    c.increment()
    println(c.current())
  }
}




