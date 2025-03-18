package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide de transition vers la démo
 */
class DemoSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide demo-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-top-left")
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-bottom-right")
            
            div(classes = "demo-title") {
                h2 {
                    +"Place à la"
                }
                h1 {
                    +"DÉMO"
                }
            }
            
            div(classes = "demo-content") {
                div(classes = "demo-cta") {
                    +"Voyons cette magie cosmique en action..."
                }
            }
        }
    }
} 