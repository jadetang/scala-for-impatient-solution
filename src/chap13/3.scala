package chap13

object main3 {
  def main(args: Array[String]) {

    def removeZero(list: List[Int]): List[Int] = {
      list.filter(_ != 0)
    }


    def removeZeroRecursive(list:List[Int]):List[Int]= list match {
      case Nil =>Nil
      case h::tail => if(h!=0) h::removeZeroRecursive(tail) else removeZeroRecursive(tail)
    }

    val l = List(1,2,3,5,-5,9,0,8)
    println(removeZero(l))
    println(removeZeroRecursive(l))

  }
}