package chap13


object main2 {
  def main(args: Array[String]) {
    def indexes(s: String) = s.zipWithIndex.groupBy(_._1).map( x=>(x._1,x._2.map(_._2).toSet))
    val x = indexes("Missisipi")
    println(x)
  }
}