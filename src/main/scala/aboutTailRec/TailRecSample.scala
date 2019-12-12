package aboutTailRec

object AboutTailRec {

  def sum(list: List[Long]): Long = list match {
    case Nil => 0
    case x :: xs => x + sum(xs)
  }

  def sumT(list: List[Long]): Long = {
    @annotation.tailrec
    def loop(as: List[Long], current: Long): Long = as match {
      case Nil => current
      case x :: xs => loop(xs, x + current)
    }
    loop(list, 0)
  }
}