package s99

import org.scalatest.FunSpec

class P16Spec extends FunSpec {

  describe("P16"){
    it("P16.drop(3, List(\"a\", \"b\", \"c\", \"d\", \"e\", \"f\", \"g\", \"h\", \"i\", \"j\", \"k\")) === List(a, b, d, e, g, h, j, k)"){
      assert(P16.drop(3, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")) === List("a", "b", "d", "e", "g", "h", "j", "k"))
    }
  }

}