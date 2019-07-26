package collection



object Collection {

  def reverse[T](list: List[T]): List[T] =
    list.foldLeft(List[T]())((x, y) => y :: x)

  def sum(list: List[Int]): Int =
    list.foldRight(0)(_ + _)

  def multi(list: List[Int]): Int =
    list.foldRight(1)(_ * _)

  def mkString[T](list: List[T])(sep: String): String = list match {
    case Nil => ""
    case x :: xs => xs.foldLeft(x.toString)(_ + sep + _)
  }

  def map[T, U](list: List[T])(f: T => U): List[U] =
    reverse(list.foldLeft(List[U]())((x, y) => f(y) :: x))

  def filter[T](list: List[T])(f: T => Boolean): List[T] =
    reverse(list.foldLeft(List[T]())((x, y) => if(f(y)) y::x else x))

}