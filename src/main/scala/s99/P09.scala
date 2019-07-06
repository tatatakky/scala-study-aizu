package s99

object P09 {

  def pack[A](as: List[A]): List[List[A]] = {
    as.foldRight(Nil: List[List[A]]) { (e, ls) =>
      ls match {
        case (x @ `e` :: _) :: xs => (e :: x) :: xs
        case _                    => List(e) :: ls
      }
    }
  }
}
