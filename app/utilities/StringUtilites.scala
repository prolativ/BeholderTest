package utilities

import java.util.UUID

/**
 * Created by Masa on 6/7/15.
 */
object StringUtilites {

  /**
   * 特定の文字列が空か判定
   * @param str
   * @return
   */
  def isEmpty(str: String): Boolean = str == null || str.isEmpty

  /**
   * 特定の文字列が空でないか判定
   * @param str
   * @return
   */
  def isNotEmpty(str: String): Boolean = !isEmpty(str)

  /**
   * ハイフンを取り除いたUUID
   * @return
   */
  def uuidRemovedHaifun(): String = {
    val str = UUID.randomUUID().toString()
    str.replaceAll("-", "")
  }

  /**
   * 改行コードCRLFに置換
   * @param text
   * @return
   */
  def replaceToCRLF(text: String): String = {
    text.replaceAll("\\r\\n|\\r|\\n", "\r\n")
  }

  /**
   * UTF-8の半角スペースを半角スペースに置換
   * @param text
   * @return
   */
  def replaceFromUTF8SpaceToSpace(text: String): String = {
    text.replaceAll("[\\xc2\\xa0]", " ")
  }

}
