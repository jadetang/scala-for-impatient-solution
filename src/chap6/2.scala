package chap6

class UnitConversion(val factor: Double) {
  def convert(value: Double): Double = factor * value
}

object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.7854118)
object MilesToKilometers extends UnitConversion(1.609344)

object main2{
  def main(args: Array[String]) {
    println("%f inch = %f santimeters".format(1.0, InchesToCentimeters.convert(1.0)))
    println("%f gallon = %f liters".format(1.0, GallonsToLiters.convert(1.0)))
    println("%f mile = %f kilometers".format(1.0, MilesToKilometers.convert(1.0)))
  }
}