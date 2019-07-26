package dwangoText.contolSyntax

import org.scalatest._
class ControlSyntaxSpec extends WordSpec {

  import ControlSyntax._

  "isToddler" should {
    "return result string 幼児です " in {
      assert(isToddler(5, false) == "幼児です")
    }
  }
}
