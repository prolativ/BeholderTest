package models

/**
 * @see http://even-eko.hatenablog.com/entry/2013/02/24/215404
 * Created by Masa on 6/6/15.
 */
case class Users()

object Users {
  def get() : List[Map[Symbol,Any]] = {
    List(
      Map('name -> "Mario", 'message -> "Paooon"),
      Map('name -> "猫", 'message -> "にゃ〜"),
      Map('name -> "犬", 'message -> "わん"),
      Map('name -> "牛", 'message -> "もぉ〜")
    )
  }
}