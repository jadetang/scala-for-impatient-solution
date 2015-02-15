package chap14



abstract class Item

case class Article(desc:String,price:Double) extends Item

case class Bundle(desc:String,discount:Double,items:Item*) extends Item

case class Multiple(count:Int,item:Item) extends Item

object main4{
  def main(args: Array[String]) {
    def price(it:Item):Double = it match{
      case Article(_,p) => p
      case Bundle(_,disc, its @ _*) => its.map(price _).sum - disc
      case Multiple(count,its) =>count*price(its)
    }

    val ipad = Article("ipad",2000)
    println(price(ipad))

    val twoIpad = Multiple(2,ipad)
    println(price(twoIpad))

    val ipadAndIphone = Bundle("one ipad and iphone with 200 discount",200,Article("ipad",2000),Article("iphone",4000))
    val ten = Multiple(10,ipadAndIphone)
    println(price(ten))


  }
}