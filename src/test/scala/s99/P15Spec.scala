package s99

import org.scalatest.FunSpec

class P15Spec extends FunSpec {
  describe("P15") {
    it("P15.duplicateN(3, List(\"a\", \"b\", \"c\", \"d\", \"e\")) === List(\"a\", \"a\", \"a\", \"b\", \"b\", \"b\", \"c\", \"c\", \"c\", \"d\", \"d\", \"d\", \"e\", \"e\", \"e\")"){
      assert(P15.duplicateN(3, List("a", "b", "c", "d", "e")) === List("a", "a", "a", "b", "b", "b", "c", "c", "c", "d", "d", "d", "e", "e", "e"))
    }
  }
}