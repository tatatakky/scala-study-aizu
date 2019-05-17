package dwangoText.contolSyntax

object ControlSyntax {
  def isToddler(age: Int, isSchoolStarted: Boolean): String = {
    if(1 <= age && age <= 6 && !isSchoolStarted){
      "幼児です"
    } else {
      "幼児ではありません"
    }
  }

}