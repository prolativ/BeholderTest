package models

import play.api.libs.json.Json

/**
 * Created by Masa on 5/24/15.
 */
case class Person(name:String)

object Person{
  implicit var personFormat = Json.format[Person]
}