package no.solve

import org.jetbrains.exposed.sql.Table

object Persons : Table("person") {
    val id = integer("id").primaryKey()
    val name = text("name")
    val phone = integer("phone")
    val address = text("address")
}