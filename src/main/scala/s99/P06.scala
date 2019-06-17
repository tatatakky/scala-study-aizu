package s99

import P05.reverse

object P06 {

  def isPalindrome[T](list: List[T]): Boolean = list == reverse(list)
//    def goEven(n: Int, lst: List[T], newList: List[T]): Boolean = lst match {
//      case xs if n==0 => newList == xs
//      case x :: xs if n>0 => goEven(n-1, xs, x :: newList)
//      case _ => sys.error("isEmpty")
//    }
//    def goOdd(n: Int, lst: List[T], newList: List[T]): Boolean = lst match {
//      case x :: xs if n==0 => newList == xs
//      case x :: xs if n>0 => goOdd(n-1, xs, x :: newList)
//      case _ => sys.error("isEmpty")
//    }
//    val len = length(list)
//    if(len%2==0) {
//      goEven(len/2, list, List())
//    } else{
//      goOdd(len/2, list, List())
//    }

}