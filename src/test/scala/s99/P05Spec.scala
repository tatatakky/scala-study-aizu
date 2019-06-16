package s99

import org.scalatest.{FunSpec, DiagrammedAssertions}

class P05Spec extends FunSpec with DiagrammedAssertions {

  describe("P05"){
    it("if the list is empty"){
      assert(P05.reverse(List()) == List())
    }

    it("if the list is one element"){
      assert(P05.reverse(List(3)) == List(3))
    }

    it("if the list has two more element"){
      assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) == List(8,5,3,2,1,1))
    }
  }

}