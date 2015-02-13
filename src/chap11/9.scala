package chap11


object RichFile {
  def unapplySeq(s: String): Option[Seq[String]] = {
    if (s.trim == "") None else Some(s.trim.split("/"))
  }
}

object main9{
  def main(args: Array[String]) {
    val RichFile(first, middle, last) = "home/user/text.txt"

    println("First: %s, Middle: %s, Last: %s".format(first, middle, last))
  }
}