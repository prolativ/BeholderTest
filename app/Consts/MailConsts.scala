package consts

/**
 * Created by Masa on 6/10/15.
 */
object MailConsts {

  val textOfMailTypes = "0"
  val htmlOfMailTypes = "1"
  private val mailTypes = Map(textOfMailTypes -> "テキスト", htmlOfMailTypes -> "HTML")

  def textValuelOfMailTypes: String = {
    mailTypes(textOfMailTypes)
  }

  def htmlValuelOfMailTypes: String = {
    mailTypes(htmlOfMailTypes)
  }

  val immediateOfSendTypes = "0"
  val timerOfSendTypes = "1"
  private val sendTypes = Map(immediateOfSendTypes -> "即時送信", timerOfSendTypes -> "タイマー")

  def immediateValueOfSendTypes: String = {
    sendTypes(immediateOfSendTypes)
  }

  def timerValueOfSendTypes: String = {
    sendTypes(timerOfSendTypes)
  }


}
