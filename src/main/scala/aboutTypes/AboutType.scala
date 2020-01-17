package aboutTypes

object AboutType {

  def rle: String => String = toCharAndRunLength andThen fromCharAndRunLength

  def fromCharAndRunLength: List[(Char, Int)] => String = rlsToStrs andThen (_.mkString)

  def toCharAndRunLength: String => List[(Char, Int)] = str => countCharNum(str.toList)

  def rlsToStrs: List[(Char, Int)] => List[String] = as => as.foldRight(List[String]())((h, acc) => h._1 + h._2.toString :: acc)

  def countCharNum: List[Char] => List[(Char, Int)] = as => {
    def lstrTolTupleCharInt1(pre: Char, list: List[Char], n: Int): List[(Char, Int)] = list match {
      case x :: xs if pre == x => lstrTolTupleCharInt1(pre, xs, n + 1)
      case x :: xs             => (pre, n) :: lstrTolTupleCharInt1(x, xs, 1)
      case _                   => List((pre, n))
    }
    as match {
      case x :: xs => lstrTolTupleCharInt1(x, xs, 1)
      case _       => List()
    }
  }

  def main(args: Array[String]): Unit = {
    val str: String = "AAAABBCCCD"
    val res: String = rle(str)
    println(res)
  }
}
