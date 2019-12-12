package aboutTailRec.sample

import scala.annotation.tailrec

object TailRecSample {

  type T = Long

  def sum(list: List[T]):T = list match {
    case Nil => 0
    case x :: xs => x + sum(xs)
  }

  def sumTail(list: List[T]): T = {
    @tailrec
    def loop(as: List[T], current: T): T = as match {
      case Nil => current
      case x :: xs => loop(xs, x + current)
    }
    loop(list, 0)
  }

  def factorial(n: T): T = {
    @tailrec
    def loop(num: T, current: T): T =
      if(num == 1) current
      else {
        loop(num - 1, current * num)
      }
    loop(n, 1)
  }

  def fib(n: T): T = {
    @annotation.tailrec
    def loop(first: T, second: T, num: T): T =
      if(num == 0) first
      else {
        loop(second, first + second, num - 1)
      }
    loop(0, 1, n)
  }
}