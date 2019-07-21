package s99

object P18 {

  def slice[A](i: Int, k: Int, lst: List[A]): List[A] = {
    def go(start: Int, end: Int, l: List[A]): List[A] = lst match {
      case x :: xs if i > 0 => slice(start-1, end-1, xs)
      case x :: xs if k > 0 => x :: slice(0, end - 1, xs)
      case _ if start == 0 => List()
    }
    if (0 <= i && i <= k) go(i, k, lst) else sys.error("error")
  }
}
