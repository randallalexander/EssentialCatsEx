package sandbox.ch2

import cats.kernel.Monoid

object SetInstances {
  implicit def setUnionMonoid[A] = new Monoid[Set[A]] {
    override def empty: Set[A] = Set.empty[A]

    override def combine(x: Set[A], y: Set[A]): Set[A] = x union y
  }
}
