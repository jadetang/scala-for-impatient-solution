package chap11

import scala.collection.mutable.ArrayBuffer

class Table {
  private val chunks = new ArrayBuffer[String]

  def |(chunk: String) = {
    chunks += "<td>%s</td>\n".format(chunk)
    this
  }

  def ||(chunk: String) = {
    chunks += "</tr><tr>\n<td>%s</td>".format(chunk)
    this
  }

  override def toString = "<table>\n<tr>\n%s</tr>\n</table>".format(chunks.mkString)
}

object Table { def apply() = new Table() }

object main5{
  def main(args: Array[String]) {
    val t = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM,.NET"
    println(t)
  }
}

