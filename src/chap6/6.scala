package chap6



object PokerCard extends Enumeration{
  type PokerCard = Value
  val Diamond = Value(0,"♦")
  val Spade = Value(1,"♠")
  val Heart = Value(2,"♥")
  val Club = Value(3,"♣")
  def isRed(card:PokerCard) =  card == Heart || card == Club
}


object main6{
  def main(args: Array[String]) {
    for(c<-PokerCard.values) println(c)
    println(PokerCard.values.filter(PokerCard.isRed(_)))
  }




}

