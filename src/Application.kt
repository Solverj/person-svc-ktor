package no.solve

import com.fasterxml.jackson.databind.SerializationFeature
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.jackson.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import org.jetbrains.exposed.sql.Database
import java.lang.Compiler.enable

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    val personController = PersonController()
    fun initDB() {
        val config = HikariConfig("/hikari.properties")
        config.schema = "public"
        val ds = HikariDataSource(config)
        Database.connect(ds)
    }
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }
    initDB()
    routing {
        get("/") {
            call.respond(mapOf("status" to "up"))
        }
        get("/persons") {
            call.respond(personController.getAll())
        }
    }
}

