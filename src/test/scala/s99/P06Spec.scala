package s99

import org.scalatest.{FunSpec, DiagrammedAssertions}

class P06Spec extends FunSpec with DiagrammedAssertions {

  describe("P06") {
    it("if length of the list is Even and the list is Palindrome"){
      assert(P06.isPalindrome(List(1,2,3,3,2,1)) === true)
    }

    it("if length of the list is Odd and the list is Palindrome"){
      assert(P06.isPalindrome(List(1,2,3,2,1)) === true)
    }

    it("if the list is not Palindrome") {
      assert(P06.isPalindrome(List(1,2,3)) === false)
    }
  }
}