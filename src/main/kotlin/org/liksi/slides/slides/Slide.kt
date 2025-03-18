package org.liksi.slides.slides

import kotlinx.html.FlowContent

/**
 * Interface représentant un slide dans la présentation
 */
interface Slide {
    /**
     * Rend le contenu HTML du slide
     */
    fun FlowContent.render()
} 