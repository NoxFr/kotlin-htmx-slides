package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide de conclusion présentant les points clés à retenir
 */
class ConclusionSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-bottom-right")
            
            h2 {
                +"Que retenir de ce talk"
            }
            
            div(classes = "content") {
                p { +"Le choix des outils doit correspondre à vos besoins:" }
                
                ul {
                    li {
                        strong { +"Pragmatisme" }
                        +" - Solutions simples et efficaces qui font le job peuvent suffir dans la majorité des cas"
                    }
                    li {
                        strong { +"Scalabilité" }
                        +" - Capacité à évoluer sans refonte majeure"
                    }
                    li {
                        strong { +"Capitalisation des connaissances" }
                        +" - Valoriser l'expertise déjà présente dans l'équipe"
                    }
                    li {
                        strong { +"Intégration" }
                        +" - S'adapter harmonieusement à l'existant"
                    }
                }
                
                div(classes = "quote-container") {
                    blockQuote(classes = "elegant-quote") {
                        +"« Peu importe le flacon, pourvu qu'on ait l'ivresse. »"
                    }
                    p(classes = "quote-author") {
                        em {
                            +"— Alfred de Musset"
                        }
                    }
                }
            }
        }
    }
} 