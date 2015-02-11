package chap9

import scala.io.Source

object main9 {
  def main(args: Array[String]) {
    val dictionary = Source.fromFile("resource//GNU.txt", "UTF-8")
    for (x <- dictionary.getLines()) {
      x.split("""[\s"\.,\)\()/]+""").filter(_.length>=12).foreach(println(_))
    }
  }
}