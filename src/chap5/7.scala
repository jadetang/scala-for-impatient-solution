

class PersonWithName(name:String){
  def firstName = name.split(" ")(0)
  def lastName = name.split(" ")(1)
}

object main7{
  def main(args: Array[String]) {
    val p = new PersonWithName("jade tang")
    println("p.lastName = " + p.lastName)
    println("p.firstName = " + p.firstName)

  }
}