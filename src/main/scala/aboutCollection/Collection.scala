package aboutCollection

object Collection {

  def sum(as: List[Int]): Int = as.foldRight(0)(_ + _)

  def map[A, B](as: List[A])(f: A => B): List[B] =
    as.foldRight(List.empty[B])((a, b) => f(a) :: b)

  def filter[A](as: List[A])(f: A => Boolean): List[A] =
    as.foldRight(List.empty[A]){
      (a, b) =>
        if (f(a)) a :: b
        else b
    }
}