package s99

object P05 {

  def reverse[T](list: List[T]): List[T] = {
    def go(lst: List[T], newList: List[T]): List[T] = lst match {
      case x :: xs => go(xs, x :: newList)
      case Nil => newList
    }
    go(list, Nil)
  }
}