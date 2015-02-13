package chap11


class BigSequence(private var value:Long = 0l){
  def update(offSet:Int,newValue:Int)= value |= (1&1l)<<(offSet%64)

  def apply(bit: Int): Int = if ((value & 1L << bit % 64) > 0) 1 else 0

  override def toString = "%64s".format(value.toBinaryString).replace(" ", "0")

}


object main7{
  def main(args: Array[String]) {
    val bit = new BigSequence
    bit(1) =1
    bit(63) = 1
    println(bit)
  }
}