package chap11

import scala.collection.mutable.ArrayBuffer

class ASCIIArt {
  var art: ArrayBuffer[String] = ArrayBuffer()

  def add(line: String) = {
    art += line
    this
  }

  def | (that:ASCIIArt): ASCIIArt ={
    val newA = new ASCIIArt
    newA.art  = this.art ++ that.art
    newA
  }

  def + (that:ASCIIArt): ASCIIArt ={
    val newA = new ASCIIArt
    newA.art  = (this.art zipAll (that.art, " "*this.art(0).length, " "*that.art(0).length)).map{
      case(x,y) => x+y
    }
    newA
  }


  override def toString(): String = art.mkString("\n")
}


object main6 {
  def main(args: Array[String]) {
    val pig = new ASCIIArt
    pig.add("╭︿︿︿╮ ")
      .add("{/ o  o /} ")
      .add(" ( (oo) )  ")
      .add("  ︶ ︶︶  ")
    val heart = new ASCIIArt
    heart.add("／＼／＼")
         .add("＼　　／")
         .add("  ＼／  ")
    println(pig + heart | heart + heart)
  }
}