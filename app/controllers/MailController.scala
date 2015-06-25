package controllers

import org.slf4j.LoggerFactory
import play.api._
import play.api.i18n.Messages
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import models._


/**
 * Created by Masa on 6/7/15.
 */
object MailController extends Controller {

  case class SelectMail(mailType: Int)

  case class InputMail(title: String, content: String, mailType: Int, sendType: Int, signature: String)

  val selectFrom = Form(
    mapping("mailType" -> number(min = 0, max = 1)
    )(SelectMail.apply)(SelectMail.unapply)
  )

  val inputForm = Form(
    mapping("title" -> text,
      "content" -> text,
      "mailType" -> number(min = 0, max = 1),
      "sendType" -> number(min = 0, max = 1),
      "signature" -> text
    )(InputMail.apply)(InputMail.unapply)
  )

  def index = Action {
    Ok(views.html.mail.index("メール一覧", "", selectFrom))
  }

  def selectAction = Action { implicit request =>
    var reform = selectFrom.bindFromRequest

    /**
     * @see http://kanndume.blogspot.jp/2012/05/play-framework-20.html
     *      フォームの定義に制約を指定している場合は、foldを使って必ずエラーハンドリングするように！
     *      問題ない場合はタプルとして値が取得でき、型の制約も特に問題なく動作する
     */
    reform.fold(
      errors => Ok(views.html.mail.index("メール一覧", Messages("error.invalid.select"), selectFrom)),
      value => Redirect("/mail/input/" + reform.get.mailType)
    )
  }

  def input(mailType: Int) = Action {
//    val map : Map[String,String] = Map() // 空のマップ
    Ok(views.html.mail.input("メール編集", inputForm, Map()))
  }

  def previewAction = Action { implicit request =>
    var reform = inputForm.bindFromRequest

    reform.fold(
      errors => Ok(views.html.mail.input("メール編集", inputForm, reform.data)),
      value => {
        val inputData = reform.get
        Ok(views.html.mail.preview("メール入力プレビュー", inputData))
      }
    )
  }


  def preview = Action {
    Ok(views.html.mail.preview("メール入力プレビュー", null))
  }

  //  def sendPeviewAction = Action {
  //
  //  }
  //
  //  def sendPreview = Action {
  //
  //  }


}
