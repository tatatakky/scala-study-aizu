package s99

object P15 {

  def dup[A](x: A, n: Int, xs: List[A]): List[A] = {
    def go(n: Int, xs: List[A]): List[A] = {
      if(n > 0){
        go(n-1, x::xs)
      } else {
        xs
      }
    }
    go(n, xs)
  }

  def duplicateN[A](n: Int, as: List[A]): List[A] =
    as.foldRight(List[A]())((x, y) => dup(x, n, List()) ::: y)
}