package chap9
import scala.io.Source

object main4{
  def main(args: Array[String]) {
    val source = Source.fromFile("resource\\float.txt","UTF-8")
    val tokens= source.mkString.split("\\s+")
    val numbers = tokens.map(_.toDouble)
    println("sum:"+numbers.sum)
    println("average:"+numbers.sum/numbers.length)
    println("max:"+numbers.max)
    println("min:"+numbers.min)
  }
}