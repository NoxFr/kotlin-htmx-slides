package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide de titre de la présentation
 */
class TitleSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide title-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-top-left")
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-bottom-right")
            
            h1 {
                +"Tout plaquer et partir Fullstack Kotlin & HTMX"
            }
            div(classes = "speaker") {
                +"Par Mathieu Durand"
            }
        }
    }
} 