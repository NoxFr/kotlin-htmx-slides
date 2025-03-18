package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide présentant le framework Ktor
 */
class KtorSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-bottom-right")
            
            h2 {
                +"Ktor"
            }
            
            div(classes = "content") {
                p {
                    strong { +"Ktor" }
                    +" - Un framework asynchrone Kotlin-native pour créer des applications connectées:"
                }
                
                ul {
                    li { 
                        strong { +"Léger et flexible" }
                        +" - Architecture modulaire basée sur plugins, minimisant l'overhead"
                    }
                    li { 
                        strong { +"Client et serveur" }
                        +" - Même API pour les applications frontend et backend"
                    }
                    li { 
                        strong { +"100% Kotlin" }
                        +" - Conçu pour tirer pleinement parti des fonctionnalités du langage"
                    }
                    li { 
                        strong { +"Coroutines natives" }
                        +" - Programmation asynchrone non-bloquante simplifiée"
                    }
                    li { 
                        strong { +"Multiplateforme" }
                        +" - Déployable sur JVM, Android, iOS, et plus encore"
                    }
                }
                
                p {
                    +"Les avantages d'utiliser Ktor avec notre stack:"
                }
                
                ul {
                    li { +"Cohérence parfaite avec Kotlin HTML DSL" }
                    li { +"Excellent pour les API REST et les serveurs HTML" }
                    li { +"Performance élevée pour les applications réactives" }
                    li { +"Surface d'API minimale à apprendre" }
                }
            }
        }
    }
} 