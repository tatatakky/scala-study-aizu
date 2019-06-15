package s99

object P04 {

  def length[T](lst: List[T]): Int = {
    @annotation.tailrec
    def go(l: List[T], count: Int): Int = l match {
      case x :: xs => go(xs, count+1)
      case Nil => count
    }
    go(lst, 0)
  }
}