package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide présentant les outils (Kotlin et HTML DSL)
 */
class ToolsSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-bottom-right")
            
            h2 {
                +"Les outils"
            }
            
            div(classes = "content") {
                p {
                    strong { +"Kotlin" }
                    +" - Un langage moderne, concis et expressif:"
                }
                
                ul {
                    li { +"Typage fort et inférence de types" }
                    li { +"Null-safety natif" }
                    li { +"Extensions de fonctions et propriétés" }
                    li { +"Coroutines pour une programmation asynchrone élégante" }
                }
                
                p {
                    strong { +"Kotlin HTML DSL" }
                    +" - Pourquoi c'est bien:"
                }
                
                ul {
                    li { +"Structure du HTML reflétée dans le code" }
                    li { +"Type-safe : erreurs attrapées à la compilation" }
                    li { +"Intégration naturelle avec la logique Kotlin" }
                    li { +"Réutilisation de composants via des fonctions d'extension" }
                }
            }
        }
    }
} 