package chap13

import scala.io.Source

object main10 {
  def main(args: Array[String]) {
    val s = Source.fromFile("resource/GNU.txt")
    val start = System.currentTimeMillis()
    val freq = new collection.mutable.HashMap[Char, Int]
    for (c <- s) if (c.isLetter) freq(c.toLower) = freq.getOrElse(c.toLower, 0) + 1
    println(freq.toSeq.sorted)
    println("take time:" + (System.currentTimeMillis() - start))


/*    val s2 = Source.fromFile("resource/GNU.txt")
    val start2 = System.currentTimeMillis()
    val freq2 = s2.mkString.par.aggregate(new mutable.HashMap[Char, Int])(
      (x, c) => {
        if(c.isLetter) {
          val m = (x + (c -> (x.getOrElse(c, 0) + 1)))
          val t = m.asInstanceOf[mutable.HashMap[Char, Int]]
          t
        }else{
          new collection.mutable.HashMap[Char, Int]
        }
      },
      (map1:mutable.HashMap[Char,Int], map2:mutable.HashMap[Char,Int]) => {
        val m:mutable.HashMap = map1 ++ map2.map { case (k:Char, v:Int) => k -> (v + map1.getOrElse(k, 0))}
        m
      }
    )
    println(freq2.toSeq.sorted)
    println("take time:" + (System.currentTimeMillis() - start2))*/


  }
}