package chap9

object main5{
  def main(args: Array[String]) {
    val base = 2.0
    for(i<-1 to 20){
      val temp  = Math.pow(base,i)
      val temp2 = 1/temp
      println("%9.0f \t\t %-20f".format(temp,temp2))
    }
  }
}