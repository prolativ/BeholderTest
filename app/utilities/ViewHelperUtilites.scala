package utilities

import play.api.data.Form

/**
 * Created by Masa on 6/13/15.
 */
object ViewHelperUtilites {

//  /**
//   * formから値を取り出す
//   * @see 型パラメータ http://www.ne.jp/asahi/hishidama/home/tech/scala/generics.html
//   * @param form
//   * @param key 取り出す対象のkey
//   * @return
//   */
//  def getValue(form: Form[_ <: Object], key: String): String = getOrElseValue(form, key, "")
//
//  def getOrElseValue(form: Form[_ <: Object], key: String, elseValue: String): String = form.data.get(key).getOrElse(elseValue)

  /**
   * formから値を取り出す
   * @see 型パラメータ http://www.ne.jp/asahi/hishidama/home/tech/scala/generics.html
   * @param formData
   * @param key 取り出す対象のkey
   * @return
   */
  def getValue(formData: Map[String,String], key: String): String = getOrElseValue(formData, key, "")

  def getOrElseValue(formData: Map[String,String], key: String, elseValue: String): String = formData.getOrElse(key,elseValue)

}
