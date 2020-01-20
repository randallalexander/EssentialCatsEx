import cats.syntax.eq._
import cats.instances.option._
import sandbox.ch1.Cat

val cat1 = Cat("Garfield", 38, "orange and black")
val cat2 = Cat("Heathcliff", 33, "orange and black")

val optionCat1 = Option(cat1)
val optionCat2 = Option.empty[Cat]

//this works in console and in a class file
//but not in a worksheet for some reason :(

cat1 === cat2
cat1 === cat1
optionCat1 === optionCat2

