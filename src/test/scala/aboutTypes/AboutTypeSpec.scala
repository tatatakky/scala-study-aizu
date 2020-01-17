package aboutTypes

import org.scalatest.FunSpec
import AboutType.rle

class AboutTypeSpec extends FunSpec {

  describe("Run Length Encoding") {
    it("example 1") {
      val str: String = "AAAABBCCCD"
      assert(rle(str) === "A4B2C3D1")
    }
    it("example 2") {
      val empty: String = ""
      assert(rle(empty) === "")
    }
  }
}