package chap6
object Conversions{
  def inchesToCentimeters(inches:Double) = inches*2.54

  def gallonsToLiters(gallons:Double) = gallons*3.7854118

  def milesToKilometers(miles:Double) = miles*1.609344
}


object main1{
  def main(args: Array[String]) {
    println(Conversions.inchesToCentimeters(1.2))
    println(Conversions.milesToKilometers(40))
  }
}