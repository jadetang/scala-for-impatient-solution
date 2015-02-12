package chap9

import java.io.File

object main9 {
  def main(args: Array[String]) {
    def getFileTree(f: File): Stream[File] =
      f #:: (if (f.isDirectory) f.listFiles().toStream.flatMap(getFileTree) else Stream.empty)

    println("More elegant solution: %d".format(getFileTree(new File("./")).filter(_.getName.endsWith(".scala")).size))
  }
}