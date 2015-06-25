import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import utilities.StringUtilites

/**
 * Created by Masa on 6/7/15.
 */
class StringUtilitiesSpec extends Specification {

  "StringUtilites" should {

    "空文字は空です isEmpty:true" in {
      true must equalTo(StringUtilites.isEmpty(""))
    }

    "空白は空ではありません isNotEmpty:true" in {
      true must equalTo(StringUtilites.isNotEmpty(" "))
    }

    "aaaaaaaaaaは空ではありません isEmpty:false" in {
      false must equalTo(StringUtilites.isEmpty("aaaaaaaaaa"))
    }

    "aaaaaaaaaaは空ではありません　isNotEmpty:true" in {
      true must equalTo(StringUtilites.isNotEmpty("aaaaaaaaaa"))
    }

  }
}
