package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide de remerciements et questions
 */
class ThankYouSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide thank-you-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-bottom-right")
            
            h2 {
                +"Merci pour votre attention !"
            }
            
            div(classes = "content centered") {
                h3 {
                    +"Des questions ?"
                }
            }
            
            div(classes = "links-container bottom-links") {
                a(href = "https://github.com/NoxFr/kotlin-htmx", classes = "repo-link") {
                    img(src = "/static/images/github-icon.svg", classes = "github-icon")
                    +"Le code source"
                }
                
                a(href = "https://github.com/NoxFr/kotlin-htmx-slides", classes = "repo-link") {
                    img(src = "/static/images/github-icon.svg", classes = "github-icon")
                    +"Les slides"
                }
            }
        }
    }
} 