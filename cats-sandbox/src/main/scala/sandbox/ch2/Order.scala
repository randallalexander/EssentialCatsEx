package sandbox.ch2

import cats.Monoid
import cats.instances.double._
import cats.syntax.semigroup._

final case class Order(totalCost: Double, quantity: Double)

object Order {
  val orderMonoid = new Monoid[Order] {
    override def empty: Order = Order(totalCost = 0.0, quantity = 0.0)

    override def combine(x: Order, y: Order): Order = {
      Order(
        totalCost = x.totalCost |+| y.totalCost,
        quantity = y.quantity |+| y.quantity
      )
    }
  }
}
