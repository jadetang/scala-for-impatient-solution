package chap13

import scala.collection.mutable

object main1 {
  def f(str: String): mutable.Map[Char, mutable.LinkedHashSet[Int]] = {
    val count = scala.collection.mutable.Map[Char, mutable.LinkedHashSet[Int]]()
    for ((char, index) <- str.zipWithIndex) {
      count(char) = count.getOrElse(char,  mutable.LinkedHashSet[Int]()) + index
    }
    count
  }

  def main(args: Array[String]) {
    println(f("Mississippi"))
  }
}