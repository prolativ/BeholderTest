package utilities

import java.text.{SimpleDateFormat, DateFormat}
import java.text.DateFormat._
import java.util.{Locale, Date}

/**
 * @see http://blog.mwsoft.jp/article/45391549.html
 *      Created by Masa on 6/7/15.
 */
object DateUtilites {

  /**
   * yyyymmdd形式
   */
  val yyyymmdd = "%tY%<tm%<td"

  /**
   * yyyy/mm/dd形式
   */
  val yyyymmddWithSlash = "%tY/%<tm/%<td"

  /**
   * yyyy-mm-dd形式
   */
  val yyyymmddWithHaifun = "%tF"

  /**
   * yyyy/mm/dd hh:mm:ss形式
   */
  val yyyyTossWithDefault = "%tY/%<tm/%<td %<tH:%<tM:%<tS"

  /**
   * 現在日時をデフォルトフォーマットで返却
   * @return
   */
  def nowWithDefaultFormat(): String = {
    val df = getDateInstance(LONG, Locale.JAPAN)
    df format now
  }

  /**
   * 現在日を指定した日付フォーマットで返却
   * @param f
   * @return
   */
  def nowUseFormat(f: String): String = f format now()

  /**
   * 現在日時を返却
   * @return
   */
  def now(): Date = {
    val now = new Date
    now
  }

  /**
   * 現在日時をLong形式の形で返却
   * @return
   */
  def nowWithLongValue: Long = now() getTime

}
