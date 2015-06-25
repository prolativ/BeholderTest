package utilities

import scala.math.floor
import math._

/**
 * Created by Masa on 6/6/15.
 */
object NumberUtilities {

  /**
   * 消費税込みの金額を返却
   * @param price
   * @return
   */
  def appendTax(price: Int) = floor(price * 1.08) toInt

  /**
   * 消費税込みの金額を返却
   * @param price
   * @return
   */
  def appendTaxForDouble(price: Double) = floor(price * 1.08)

  /**
   * 消費税込みの金額を３桁区切りの形で返却
   * @param price
   * @return
   */
  def appendTaxWithFormat(price: Int): String = numberFormat(appendTax(price))

  /**
   * 消費税込みの金額を３桁区切りの形で返却
   * @param price
   * @return
   */
  def appendTaxWithFormatForDouble(price: Double): String = numberFormatForDouble(appendTaxForDouble(price))

  /**
   * 3桁区切りの文字列を返却
   * @param number
   * @return
   */
  def numberFormat(number: Int): String = "%,d" format number

  /**
   * 3桁区切りの文字列を返却
   * @param number
   * @return
   */
  def numberFormatForDouble(number: Double): String = numberFormat(floor(number) toInt)

  /**
   * 四捨五入
   * @param number
   * @return
   */
  def roundOff(number: Double): Int = floor(number + 0.5) toInt
}
