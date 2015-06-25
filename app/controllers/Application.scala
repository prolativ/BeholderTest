package controllers

import java.text.DateFormat
import java.util.{Date, Locale}
import java.text.DateFormat._
import utilities.{StringUtilites, NumberUtilities, DateUtilites, TimerUtilites}

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import models._
import anorm._

/**
 *
 * @see http://www29.atwiki.jp/tmiya/pages/14.html
 */
object Application extends Controller {

  //  val format = DateUtilites.yyyymmddWithHaifun
  //  println(DateUtilites.nowUseFormat(format))
  //
  //  TimerUtilites.executePerPeriod(timeFlies, 1000, 3)

  val form1 = Form(
    // idはfrom側に用意しないため、ignoredで記述する
    mapping(
      "id" -> ignored(None: Option[Long]),
      "name" -> text,
      "age" -> number,
      "address" -> text,
      "tel" -> text
    )(AddressBook.apply)(AddressBook.unapply)
  )

  def index = Action {
    var book: List[AddressBook] = AddressBook.all
    Ok(views.html.index("住所録一覧", book))
  }

  def add = Action { implicit request =>
    var reform = form1.bindFromRequest
    Ok(views.html.add("住所録の登録", reform))
  }

  def send = Action { implicit request =>
    var reform = form1.bindFromRequest
    reform.get.add
    Redirect("/")
  }

  def timeFlies() {
    println("time flies like an arrow...")
  }

}