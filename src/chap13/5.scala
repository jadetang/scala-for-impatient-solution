object main5{
  def main(args: Array[String]) {
    def mkstr(a:Seq[AnyVal],delimeter:String):Any = a.reduceLeft(_+delimeter+_)

    val list = List(1,2,3)
    println(mkstr(list,":"))

  }
}