package s99

import org.scalatest.{DiagrammedAssertions, FunSpec}

class P02Spec extends FunSpec with DiagrammedAssertions {

  describe("P02"){
    it("If empty or only one element"){
      intercept[Throwable]{
        P02.penultimate(List(1))
      }
    }

    it("if two element"){
      assert(P02.penultimate(List(1,2)) == 1)
    }

    it("if two more element"){
      assert(P02.penultimate(List(1,2,3,4)) == 3)
    }
  }

}