package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide présentant les avantages d'HTMX
 */
class HtmxSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-top-left")
            
            h2 {
                +"HTMX"
            }
            
            div(classes = "content") {
                p {
                    strong { +"HTMX" }
                    +" - JavaScript minimaliste pour manipuler le HTML directement:"
                }
                
                ul {
                    li { 
                        strong { +"Simplicité" }
                        +" - Permet des interactions AJAX, CSS transitions et WebSockets avec de simples attributs HTML"
                    }
                    li { 
                        strong { +"Hypermedia-driven" }
                        +" - Traite le HTML comme un véritable média hyperlien, pas juste comme une structure statique"
                    }
                    li { 
                        strong { +"Pas de JavaScript à écrire" }
                        +" - Ajoute des comportements dynamiques via des attributs HTML standards"
                    }
                    li { 
                        strong { +"Intégration facilité" }
                        +" - Fonctionne avec le modèle mental du HTML, sans nouvelles abstractions"
                    }
                    li { 
                        strong { +"Léger" }
                        +" - Seulement ~14kb gzippé, sans dépendances"
                    }
                }
                
                p {
                    +"Les avantages avec notre stack Kotlin:"
                }
                
                ul {
                    li { +"Le serveur reste la source de vérité et génère le HTML via le DSL Kotlin" }
                    li { +"Pas de duplication de logique entre front et back (validation, rendu, etc.)" }
                    li { +"Mises à jour ciblées du DOM sans rechargement complet de pages" }
                    li { +"Développement plus rapide avec moins de code à maintenir" }
                }
            }
        }
    }
} 