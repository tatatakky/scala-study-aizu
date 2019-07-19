package s99

object P16 {

  def drop[A](n: Int, lst: List[A]): List[A] = {
    def loop(count: Int, n:Int, lst: List[A], newList: List[A]): List[A] = {
      lst match {
        case Nil => newList
        case x :: xs if count % n != 0 => loop(count+1, n, xs, x :: newList)
        case _ :: xs => loop(count+1, n, xs, newList)
      }
    }
    loop(1, n, lst, List[A]()).reverse
  }
}