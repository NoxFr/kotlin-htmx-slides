package org.liksi.slides.slides

import kotlinx.html.FlowContent

/**
 * Classe gérant l'ensemble des slides de la présentation
 */
class SlideDeck {
    // Liste de tous les slides dans l'ordre de présentation
    private val slides = listOf(
        TitleSlide(),
        WhyThisTalkSlide(),
        ToolsSlide(),
        KotlinHtmlDslSlide(),
        KtorSlide(),
        HtmxSlide(),
        HtmxCodeSlide(),
        DemoSlide(),
        ConclusionSlide(),
        ThankYouSlide()
    )
    
    /**
     * Nombre total de slides
     */
    val count: Int
        get() = slides.size
    
    /**
     * Rend tous les slides dans un conteneur HTML
     */
    fun FlowContent.renderAll() {
        slides.forEachIndexed { _, slide ->
            with(slide) {
                render()
            }
        }
    }
} 