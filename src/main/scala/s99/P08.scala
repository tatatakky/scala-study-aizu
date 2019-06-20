package s99

object P08 {

  def compress[T](list: List[T]): List[T] = {
    def compress1(pre: T, lst: List[T]): List[T] = lst match {
      case x :: xs if pre == x => compress1(pre, xs)
      case x :: xs             => pre :: compress1(x, xs)
      case Nil                 => pre :: Nil
    }
    list match {
      case x :: xs => compress1(x, xs)
      case Nil => Nil
    }
  }
}
