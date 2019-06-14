package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P01Spec extends FunSpec with DiagrammedAssertions {

  describe("P01"){
    it("if empty list is, fail"){
      intercept[Throwable]{
        P01.last(List[Int]())
      }
    }

    it("if the list has one element"){
      assert(P01.last(List(1)) == 1)
    }

    it("if the list has more than one element"){
      assert(P01.last(List(1,2,3)) == 3)
    }
  }

}