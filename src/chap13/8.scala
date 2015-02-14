package chap13

object main8{
  def main(args: Array[String]) {
    val x= Array(1,2,3,4,5,6)
    val result = x.grouped(3).toArray.map(_.toArray)
    println(result.deep.mkString)
  }
}