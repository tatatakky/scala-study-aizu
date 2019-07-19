package s99

import org.scalatest.FunSpec

class P17Spec extends FunSpec {
  describe("P17"){
    it("P17.split(3, List(\"a\", \"b\", \"c\", \"d\", \"e\", \"f\", \"g\", \"h\", \"i\", \"j\", \"k\")) === (List(a, b, c),List(d, e, f, g, h, i, j, k))"){
      assert(P17.split(3, List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")) === (List("a", "b", "c"),List("d", "e", "f", "g", "h", "i", "j", "k")))
    }
  }
}