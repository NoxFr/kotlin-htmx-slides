package org.liksi.slides.slides

import kotlinx.html.*

/**
 * Composant de navigation pour les slides
 */
object Navigation {
    /**
     * Rend les boutons de navigation
     */
    fun FlowContent.renderNavigation(slideCount: Int) {
        div(classes = "nav-buttons") {
            button(classes = "nav-button") {
                id = "prev-slide"
                +"←"
            }
            div {
                id = "slide-indicator"
                +"1 / $slideCount"
            }
            button(classes = "nav-button") {
                id = "next-slide"
                +"→"
            }
        }
    }
} 