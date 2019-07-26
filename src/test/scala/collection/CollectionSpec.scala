package collection

import org.scalatest.FunSpec

class CollectionSpec extends FunSpec {

  val list: List[Int] = List(1, 2, 3, 4, 5)

  describe("Collection"){
    it("reverse function works well."){
      assert(Collection.reverse(list) === List(5, 4, 3, 2, 1))
    }

    it("sum function works well."){
      assert(Collection.sum(list) === 15)
    }

    it("multi function works well."){
      assert(Collection.multi(list) === 120)
    }

    it("mkString function works well."){
      assert(Collection.mkString(list)("a") === "1a2a3a4a5")
      assert(Collection.mkString(Nil)("a") === "")
    }

    it("map function works well."){
      assert(Collection.map(list)(_ * 2) === List(2, 4, 6, 8, 10))
    }

    it("filter function works well."){
      assert(Collection.filter(list)(_ % 2 == 1) === List(1, 3, 5))
    }
  }
}