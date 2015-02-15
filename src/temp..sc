
class Pair[T](val first:T,val second:T){
  def repalceFirst[R>:T](newFirst:R) = new Pair[R](newFirst,second)
}

