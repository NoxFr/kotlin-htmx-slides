package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Slide présentant un exemple de code Kotlin HTML DSL
 */
class KotlinHtmlDslSlide : Slide {
    override fun FlowContent.render() {
        div(classes = "slide content-slide") {
            img(src = "/static/images/octopus-icon.svg", classes = "octopus-icon octopus-top-left")
            
            h2 {
                +"Kotlin HTML DSL"
            }
            
            div(classes = "content") {
                p { +"Un exemple concret de création d'une page HTML avec Kotlin:" }
                
                pre {
                    code(classes = "code-kotlin") {
                        +"""
                        fun HTML.todoApp(todos: List<Todo>) {
                            head {
                                title { +"Todo App with Kotlin" }
                                styleLink("/styles.css")
                            }
                            body {
                                div(classes = "container") {
                                    h1 { +"Ma Todo Liste" }
                                    
                                    // Formulaire pour ajouter une tâche
                                    form(action = "/add", method = FormMethod.post) {
                                        input(type = InputType.text, name = "task") {
                                            placeholder = "Nouvelle tâche..."
                                        }
                                        button(type = ButtonType.submit) { +"Ajouter" }
                                    }
                                    
                                    // Liste des tâches
                                    ul(classes = "todo-list") {
                                        for (todo in todos) {
                                            li(classes = if (todo.completed) "completed" else "") {
                                                +todo.task
                                                
                                                // Bouton pour marquer comme terminée
                                                form(action = "/complete/$\{todo.id\}", method = FormMethod.post) {
                                                    button(type = ButtonType.submit) { +"✓" }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        """.trimIndent()
                    }
                }
            }
        }
    }
} 