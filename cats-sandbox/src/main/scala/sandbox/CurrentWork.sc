import sandbox.ch1.Cat

import cats._
import cats.implicits._

val cat = Cat(name = "Fluffy", age = 5, color = "brown")

println(cat.show)
