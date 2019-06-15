package s99

object P02 {

  def penultimate[T](list: List[T]): T = list match {
    case x :: _ :: Nil => x
    case _ :: xs       => penultimate(xs)
    case _             => sys.error("the list is empty!")
  }
}
