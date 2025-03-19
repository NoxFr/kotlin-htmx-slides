package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide expliquant la motivation derrière ce talk
 */
class WhyThisTalkSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-top-left")
            
            h2 {
                +"Pourquoi ce talk ?"
            }
            
            div(classes = "content") {
                p {
                    +"Dans le monde du développement web, la quête de la stack parfaite est éternelle. "
                }
                br {  }
                p {
                    strong { +"Kotlin & HTMX" }
                    +", une combinaison puissante qui :"
                }

                ul {
                    li { +"Unifie le front et le back avec un seul langage" }
                    li { +"Simplifie le développement en éliminant la complexité des frameworks JS" }
                    li { +"Surfe sur la renaissance du HTML côté serveur" }
                    li { +"Apporte une expérience développeur exceptionnelle" }
                }
            }
        }
    }
} 