package s99

import org.scalatest.{FunSpec, DiagrammedAssertions}

class P04Spec extends FunSpec with DiagrammedAssertions {

  describe("P04"){
    it("if list is empty"){
      assert(P04.length(List[Int]()) == 0)
    }

    it("if the list has one element"){
      assert(P04.length(List[Int](1)) == 1)
    }

    it("if the list has more than one element"){
      assert(P04.length(List[Int](1, 2)) == 2)
      assert(P04.length(List[Int](1, 1, 2, 3, 5, 8)) == 6)
    }
  }

}
