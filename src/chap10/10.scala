package chap10

trait IterableInputStream extends java.io.InputStream with Iterable[Byte] {

  override def iterator: Iterator[Byte] = new InputStreamIterator(this)

  class InputStreamIterator(stream: IterableInputStream) extends Iterator[Byte] {
    override def hasNext: Boolean = stream.available() > 0

    override def next(): Byte = stream.read().toByte
  }
}


object main10{
  def main(args: Array[String]) {
    val f = new java.io.FileInputStream("resource\\10.txt") with IterableInputStream
    for(b <- f) println(b.toChar)
  }
}
