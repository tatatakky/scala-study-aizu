package s99

import org.scalatest.FunSpec

class P09Spec extends FunSpec {

  describe("P09"){
    it("P09.pack(List(\"a\", \"a\", \"a\", \"a\", \"b\", \"c\", \"c\", \"a\", \"a\", \"d\", \"d\", \"e\", \"e\", \"e\")) == List(List(a, a, a, a), List(b), List(c, c), List(a, a), List(d, d), List(e, e, e))"){
      assert(P09.pack(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "d", "e", "e", "e")) === List(List("a", "a", "a", "a"), List("b"), List("c", "c"), List("a", "a"), List("d", "d"), List("e", "e", "e")))
    }
  }

}