package chap9

import java.io.PrintWriter

import scala.io.Source

object main1{
  def main(args: Array[String]) {
    val source = Source.fromFile("resource\\1.txt","UTF-8")
    val reversedline = source.getLines.toArray.reverse
    val write = new PrintWriter("resource\\reverse.txt","UTF-8")
    for(s<-reversedline){
      write.write(s+"\n")
    }
    source.close()
    write.close()
  }
}