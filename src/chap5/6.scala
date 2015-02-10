
class Person {
  private var privateAge = 0

  def age = privateAge

  def age_=(newAge: Int): Unit = {
    if (newAge < 0) {
      privateAge = 0
    } else {
      privateAge = newAge
    }
  }
}

object main6{
  def main(args: Array[String]) {
    val p = new Person
    p.age = -5
    println("p.age = " + p.age)
  }
}