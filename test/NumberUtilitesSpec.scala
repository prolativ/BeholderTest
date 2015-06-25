import org.specs2.mutable.Specification
import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import utilities.NumberUtilities

/**
 * Created by Masa on 6/7/15.
 */
class NumberUtilitesSpec extends Specification {

  "NumberUtilites" should {
    "10000円の税込み価格 appendTaxForDouble" in {
      10800 must equalTo(NumberUtilities.appendTaxForDouble(10000) toInt)
    }

    "10000円の税込み価格 appendTax" in {
      10800 must equalTo(NumberUtilities.appendTax(10000))
    }

    "10000円の税込み価格 appendTaxWithFormat" in {
      "10,800" must equalTo(NumberUtilities.appendTaxWithFormat(10000))
    }

    "10000円の税込み価格 appendTaxWithFormatForDouble" in {
      "10,800" must equalTo(NumberUtilities.appendTaxWithFormatForDouble(10000))
    }

    "10.4の四捨五入 roundOff" in {
      10 must equalTo(NumberUtilities.roundOff(10.4))
    }

    "10.5の四捨五入 roundOff" in {
      11 must equalTo(NumberUtilities.roundOff(10.5))
    }

    "10.6の四捨五入 roundOff" in {
      11 must equalTo(NumberUtilities.roundOff(10.6))
    }
  }
}
