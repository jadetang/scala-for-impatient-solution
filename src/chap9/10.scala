package chap9
import java.io._

@SerialVersionUID(42l) class Person(val name: String) extends Serializable {
  var friends: List[Person] = List()

  def add(friend: Person) :Person= {
    friends = friend :: friends
    this
  }

  override def toString():String = {
    name+" has friends "+ (for( i <-friends) yield (i.name)).mkString("[",",","]")
  }
}


object main10 {
  def main(args: Array[String]) {
    val sheldon = new Person("sheldon")
    val raj = new Person("raj")
    val penny = new Person("penny")
    val leonard = new Person("leonard")
    sheldon.add(raj).add(penny).add(leonard)
    println(sheldon)
    val out = new ObjectOutputStream(new FileOutputStream("resource\\person.obj"))
    out.writeObject(sheldon)
    out.close()
    val in = new ObjectInputStream(new FileInputStream("resource\\person.obj"))
    val fakeSheldon = in.readObject().asInstanceOf[Person]
    println(fakeSheldon)
  }
}
