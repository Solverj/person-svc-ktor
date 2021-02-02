package no.solve

import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

class PersonController {

    fun getAll(): ArrayList<Person> {
        val persons: ArrayList<Person> = arrayListOf()
        transaction {
            Persons.selectAll().map {
                persons.add(
                    Person(
                        id = it[Persons.id],
                        name = it[Persons.name],
                        phone = it[Persons.phone],
                        address = it[Persons.address]
                    )
                )
            }
        }
        return persons;
    }
}