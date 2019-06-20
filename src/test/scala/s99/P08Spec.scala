package s99

import org.scalatest.FunSpec

class P08Spec extends FunSpec {
  describe("P08"){
    it("if the list has only Nil"){
      assert(P08.compress(List()) == Nil)
    }

    it("if the list has List(a, b, c, d) all different"){
      assert(P08.compress(List('a, 'b, 'c, 'd)) == List('a, 'b, 'c, 'd))
    }

    it("if the list has List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)"){
      assert(
        P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
          List('a, 'b, 'c, 'a, 'd, 'e)
      )
    }
  }
}
