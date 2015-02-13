package chap11


class Matrix(val r: Int = 2, val c: Int = 2) {
  private val m = Array.ofDim[Int](r, c)

  def this(length: Int) {
    this(length, length)
  }

  def +(that: Matrix): Matrix = {
    val newM = new Matrix(this.r, this.c)
    for (i <- 1 to r; j <- 1 to c) {
      newM(i, j) = this(i, j) + that(i, j)
    }
    newM
  }


  def *(times: Int): Matrix = {
    val newM = new Matrix(this.r, this.c)
    for (i <- 1 to r; j <- 1 to c) {
      newM(i, j) = this(i, j) * times
    }
    newM
  }

  def rows(r: Int): Array[Int] = this.m(r - 1)

  def columns(r: Int): Array[Int] = this.m.map {
    _(r - 1)
  }

  def apply(row: Int, column: Int) = m(row - 1)(column - 1)

  def *(that: Matrix): Matrix = {
    val newM = new Matrix(this.r, that.c)
    for (i <- 1 to newM.r; j <- 1 to newM.c) {
      newM(i, j) =  product(this.rows(i),that.columns(j))
    }
    newM
  }

  def product(a: Array[Int], b: Array[Int]): Int= ((a zip b) map { case (a, b) => a * b}).sum

  def update(row: Int, column: Int, v: Int) = m(row - 1)(column - 1) = v

  override def toString = m.map(_.mkString(" ")).mkString("\n")

}


object main8 {
  def main(args: Array[String]) {
    val m = new Matrix(2,2)
    m(1,1) = 1
    m(1,2) = 1
    m(2,1) = 2
    m(2,2) = 0
    println(m)
    val m2 = new Matrix(2,3)
    m2(1,1) = 0
    m2(1,2) = 2
    m2(1,3) = 3
    m2(2,1) = 1
    m2(2,2) = 1
    m2(2,3) = 2
    println(m2)
    println((m*m2)+m2)



  }
}