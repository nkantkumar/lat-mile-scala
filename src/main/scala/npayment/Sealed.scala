package npayment

object Sealed {

  sealed trait Shape

  case class Circle(radius: Double) extends Shape

  case class Rectangle(width: Double, height: Double) extends Shape

  def describe(shape: Shape): String = shape match {
    case Circle(r) => s"A circle with radius $r"
    case Rectangle(w, h) => s"A rectangle with width $w and height $h"
    // If we add another subclass of Shape, the compiler will warn us here
  }

}
