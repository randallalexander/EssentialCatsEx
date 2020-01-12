package sandbox.ch1

import PrintableInstances._

final case class Cat(name: String, age: Int, color: String)

object Cat {
  implicit val catPrinter = new Printable[Cat] {
    override def format(cat: Cat): String = {
      val nameFmt = Printable.format(cat.name)
      val ageFmt = Printable.format(cat.age)
      val colorFmt = Printable.format(cat.color)
      s"""$nameFmt is a $ageFmt year-old $colorFmt cat."""
    }
  }
}
