package models

import play.api.db._
import anorm._
import play.api.Play.current
import anorm.SqlParser._
import play.api.db.DB

/**
 *
 * @see https://github.com/playframework/playframework/pull/3029/files
 * @param id
 * @param name
 * @param age
 * @param tel
 * @param address
 */
case class AddressBook(id: Option[Long], name: String, age: Int, tel: String, address: String) {

  def add {
    DB.withConnection { implicit c =>
      val id: Int = SQL("insert into addressbook (name, age, tel, address) values ({name}, {age}, {tel}, {address})").
        on('name -> this.name, 'age -> this.age, 'tel -> this.tel, 'address -> this.address).executeUpdate()
    }
  }
}

object AddressBook {

  val data = {
    get[Option[Long]]("id") ~
      get[String]("name") ~
      get[Int]("age") ~
      get[String]("tel") ~
      get[String]("address") map {
      case id ~ name ~ age ~ tel ~ address => AddressBook(id, name, age, tel, address)
    }
  }

  def all: List[AddressBook] = {
    DB.withConnection { implicit c =>
      val datas = SQL("Select * from addressbook").as(AddressBook.data *)
      return datas
    }
  }

}