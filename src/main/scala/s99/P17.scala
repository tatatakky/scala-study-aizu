package s99

object P17 {

  def split[A](n: Int, lst: List[A]): (List[A], List[A]) = {
    def go(n: Int, lst: List[A], nlst: List[A]): (List[A], List[A]) =
      lst match {
        case Nil               => (Nil, Nil)
        case x :: xs if n == 1 => ((x :: nlst).reverse, xs)
        case x :: xs           => go(n - 1, xs, x :: nlst)
      }
    go(n, lst, List[A]())
  }

}
