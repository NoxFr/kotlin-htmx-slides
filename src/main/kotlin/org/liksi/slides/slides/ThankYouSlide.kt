package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide de remerciements et questions
 */
class ThankYouSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide thank-you-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-center")
            
            h2 {
                +"Merci pour votre attention !"
            }
            
            div(classes = "content centered") {
                h3 {
                    +"Des questions ?"
                }
            }
        }
    }
} 