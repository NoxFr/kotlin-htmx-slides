package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide présentant un exemple de code HTMX
 */
class HtmxCodeSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-bottom-right")
            
            h2 {
                +"HTMX en action"
            }
            
            div(classes = "content") {
                p { +"Exemple d'utilisation d'HTMX pour une application de todo liste:" }
                
                pre {
                    code(classes = "language-html") {
                        +"""
                        <!-- Charger une partie de page au clic sans recharger -->
                        <button 
                            hx-get="/api/todo-items" 
                            hx-target="#todo-list" 
                            hx-swap="innerHTML">
                            Charger les tâches
                        </button>
                        
                        <!-- Ajouter une tâche avec un formulaire qui s'envoie sans refresh -->
                        <form hx-post="/api/add-todo" hx-target="#todo-list" hx-swap="beforeend">
                            <input name="task" placeholder="Nouvelle tâche..." />
                            <button type="submit">Ajouter</button>
                        </form>
                        
                        <!-- Liste qui sera mise à jour dynamiquement -->
                        <ul id="todo-list">
                            <!-- Pour chaque élément, un clic sur le bouton marque comme terminé -->
                            <li>
                                Acheter du lait
                                <button 
                                    hx-patch="/api/complete/1" 
                                    hx-target="closest li" 
                                    hx-swap="outerHTML">
                                    ✓
                                </button>
                            </li>
                        </ul>
                        """.trimIndent()
                    }
                }
            }
        }
    }
} 