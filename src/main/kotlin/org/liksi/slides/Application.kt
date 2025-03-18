package org.liksi.slides

import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import kotlinx.html.*
import org.liksi.slides.slides.Navigation
import org.liksi.slides.slides.SlideDeck

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }
        .start(wait = true)
}

fun Application.configureRouting() {
    routing {
        staticResources("/webjars", "/META-INF/resources/webjars")
        staticResources("/static", "static")

        get("/") {
            call.respondHtml {
                head {
                    title { +"Tout plaquer et partir Fullstack Kotlin & HTMX\n" }
                    link(rel = "stylesheet", href = "/static/css/styles.css")
                    link(rel = "stylesheet", href = "https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;800&display=swap")
                    link(rel = "stylesheet", href = "https://fonts.googleapis.com/css2?family=Fira+Code:wght@400;500&display=swap")
                    meta(name = "viewport", content = "width=device-width, initial-scale=1.0")
                    script(src = "/static/js/slides.js") {}
                }
                body {
                    // Rendre tous les slides
                    val slideDeck = SlideDeck()
                    with(slideDeck) {
                        renderAll()
                    }
                    
                    // Ajouter la navigation
                    with(Navigation) {
                        renderNavigation(slideDeck.count)
                    }
                }
            }
        }
    }
}
