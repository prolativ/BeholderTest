package utilities

/**
 * Created by Masa on 6/11/15.
 */
object ArrangeAppearance {
  def getOrHaifun (str : String) : String = {
    if(StringUtilites.isNotEmpty(str)){
      str
    } else {
      "-"
    }
  }
}
