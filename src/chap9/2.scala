package chap9

import java.io.PrintWriter

import scala.io.Source

object main2{
  def main(args: Array[String]) {
    val source = Source.fromFile("resource\\2.txt","UTF-8")
    val reversedline = source.getLines.toArray.reverse
    val write = new PrintWriter("resource\\2withouttab.txt","UTF-8")
    for(s<-reversedline){
      write.write(s.replace("\t"," ")+"\n")
    }
    source.close()
    write.close()
  }
}

