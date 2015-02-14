package chap13

object main4 {

  def function(word: Array[String], wordAndIndex: Map[String, Int]): Array[Int] = {
    word.map(wordAndIndex.get(_)).flatMap(x => x)
  }

  def main(args: Array[String]) {
    val x = Array("one","two","three")
    val m = Map("one"->1,"two"->2)
    println(function(x,m).mkString(" "))
  }

}