package s99

object P03 {

  def nth[T](n: Int, list: List[T]): T = list match {
    case x :: _ if n < 1   => x
    case _ :: xs if n >= 1 => nth(n - 1, xs)
    case _                 => sys.error("error")
  }
}