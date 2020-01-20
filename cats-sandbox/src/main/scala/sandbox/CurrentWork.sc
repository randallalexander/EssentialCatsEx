import cats.instances.int._
import cats.instances.option._
import cats.syntax.option._
import sandbox.ch2.SuperAdder._

add(List(1,2,3))
add(List(1.some, 2.some, 3.some, none))
