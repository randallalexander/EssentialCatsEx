package sandbox.ch1

object PrintableInstances {
  implicit val stringPrinter = new Printable[String] {
    override def format(value: String): String = value
  }

  implicit val intPrinter = new Printable[Int] {
    override def format(value: Int): String = value.toString
  }
}
