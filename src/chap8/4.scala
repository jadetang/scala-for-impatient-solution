package chap8


abstract class Item {
  def price: Double

  def description: String

  override def toString: String = "%s price is %-9.2f ￥".format(description, price)
}

class SimpleItem(override val price: Double, override val description: String) extends Item

class Bundle extends Item {

  private var _items: List[Item] = List()

  def items = _items

  override def price: Double = _items.foldLeft(0.0)((sum, item) => sum + item.price)

  override def description: String = (for (item <- _items) yield item.description).mkString("[",",","]")

  override def toString: String = _items.mkString("[", ",", "]")

  def addItem(item: SimpleItem) = {
    _items = item :: _items
  }
}


object main4 {
  def main(args: Array[String]) {
    val ipad = new SimpleItem(2500, "ipad")
    val imac = new SimpleItem(10000, "imac")
    val iphone = new SimpleItem(200, "iphone")
    val itouch = new SimpleItem(10600, "itouch")
    val bundle = new Bundle
    bundle.addItem(ipad)
    bundle.addItem(imac)
    println("bundle = " + bundle)



  }
}


