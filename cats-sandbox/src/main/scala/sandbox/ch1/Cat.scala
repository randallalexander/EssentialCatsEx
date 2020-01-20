package sandbox.ch1

import PrintableInstances._
import cats._
import cats.implicits._

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

  implicit val catShow: Show[Cat] =
    Show.show(cat => s"${cat.name.show} is a ${cat.age.show} year-old ${cat.color.show} cat.")
}
