package chap11


class Fraction(n: Int, d: Int) {
  def gcd(a: Int, b: Int): Int = if (b == 0) Math.abs(a) else gcd(b, a % b)

  private val g = gcd(n, d)

  def sign(a: Int): Int = a.compareTo(0)

  private val num: Int = if (d == 0) 1 else n * sign(d) / g

  private val den: Int = if (d == 0) 0 else d * sign(d) / g

  def +(that: Fraction) = new Fraction(this.num * that.den + this.den * that.num, this.den * that.den)

  def unary_- : Fraction = new Fraction(-num, den)

  def -(that: Fraction) = this + (-that)

  def *(that: Fraction) = new Fraction(this.num * that.num, this.den * that.den)

  def /(that: Fraction) = new Fraction(this.num * that.den, this.den * that.num)


  override def toString(): String = {
    if (den != 1) {
      num + "/" + den
    } else {
      num.toString()
    }
  }
}

object main3 {
  def main(args: Array[String]) {
    val f = new Fraction(5, 10)
    val f2 = new Fraction(50, 10)
    println(f * f2)
    println(f / f2)
  }
}