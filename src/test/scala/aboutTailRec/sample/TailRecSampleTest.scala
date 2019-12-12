package aboutTailRec.sample

import org.scalatest.FunSpec

import TailRecSample._

class TailRecSampleTest extends FunSpec {
  describe("Tail Recursive") {
    it("sumTail") {
      assert( sumTail(List.range[Long](1, 10000 + 1)) === 50005000 )
    }

    it("factorial") {
      assert( factorial(5) === 120 )
    }

    it("fibonacci") {
      assert( fib(25) === 75025)
    }
  }
}