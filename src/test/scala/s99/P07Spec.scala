package s99

import org.scalatest.FunSpec

class P07Spec extends FunSpec {

  describe("P07"){

    it("if the list is List(List(1, 1), 2, List(3, List(5, 8)))"){
      assert(P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
    }

    it("if the list is List(1,2,3,4)"){
      assert(P07.flatten(List(1,2,3,4)) == List(1,2,3,4))
    }

    it("if the list is Nil"){
      assert(P07.flatten(List()) == Nil)
    }
  }

}