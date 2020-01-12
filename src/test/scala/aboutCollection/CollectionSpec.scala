package aboutCollection

import org.scalatest.FunSpec

import Collection._

class CollectionSpec extends FunSpec {
  describe("collection implementation") {
    it("sum of element of List") {
      assert(sum(List(1, 2, 3)) === 6)
    }
    it("map via foldRight") {
      assert(map(List(1, 2, 3))(_ * 2) === List(2, 4, 6))
    }
    it("filter via foldRight") {
      assert(filter(List(1, 2, 3))(_ % 2 == 1) === List(1, 3))
    }
  }
}