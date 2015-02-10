package chap5

/**
 *
 * @author tangsicheng
 * @version 1.0    
 * @since 1.0
 */
class Car(val manufacturer: String, val model: String,val plate:String = "-1",val year:String = "") {
  override def toString() = {
    "car(%s,%s,%s,%s)".format(manufacturer,model,plate,year)
  }
}

object main8{
  def main(args: Array[String]){
    val car1 = new Car("ford","camery");
    println(car1)
    val car2 = new Car("ford","camery",year="1986")
    println(car2)
  }

}