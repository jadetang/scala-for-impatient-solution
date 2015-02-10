
import scala.beans.BeanProperty

class Student{
  @BeanProperty var name:String =_
  @BeanProperty var id:Long =_
}

object main5{
  def main(args: Array[String]) {
    val s = new Student
    print(s.getName)
  }
}