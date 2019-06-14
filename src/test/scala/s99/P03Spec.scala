package s99

import org.scalatest.{FunSpec, DiagrammedAssertions}

class P03Spec extends FunSpec with DiagrammedAssertions {

  describe("P03"){
    it("if empty "){
      intercept[Throwable]{
        P03.nth(0, List())
      }
    }

    it("if index is over size of list"){
      intercept[Throwable]{
        P03.nth(4, List(1,2))
      }
    }

    it("if correct index and list"){
      assert(P03.nth(2, List(1, 1, 2, 3, 5, 8)) == 2)
    }
  }

}