document.addEventListener('DOMContentLoaded', function() {
    const slides = document.querySelectorAll('.slide');
    const prevButton = document.getElementById('prev-slide');
    const nextButton = document.getElementById('next-slide');
    const slideIndicator = document.getElementById('slide-indicator');
    
    let currentSlideIndex = 0;
    
    // Initialize
    updateSlideIndicator();
    applySyntaxHighlighting();
    
    // Show the first slide
    slides[0].style.display = 'flex';
    
    // Event listeners for navigation buttons
    prevButton.addEventListener('click', prevSlide);
    nextButton.addEventListener('click', nextSlide);
    
    // Keyboard navigation
    document.addEventListener('keydown', function(e) {
        if (e.key === 'ArrowRight' || e.key === ' ') {
            nextSlide();
        } else if (e.key === 'ArrowLeft') {
            prevSlide();
        }
    });
    
    function prevSlide() {
        if (currentSlideIndex > 0) {
            slides[currentSlideIndex].style.display = 'none';
            currentSlideIndex--;
            slides[currentSlideIndex].style.display = 'flex';
            updateSlideIndicator();
        }
    }
    
    function nextSlide() {
        if (currentSlideIndex < slides.length - 1) {
            slides[currentSlideIndex].style.display = 'none';
            currentSlideIndex++;
            slides[currentSlideIndex].style.display = 'flex';
            updateSlideIndicator();
        }
    }
    
    function updateSlideIndicator() {
        slideIndicator.textContent = `${currentSlideIndex + 1} / ${slides.length}`;
        
        // Disable prev button on first slide
        if (currentSlideIndex === 0) {
            prevButton.disabled = true;
            prevButton.style.opacity = '0.5';
            prevButton.style.cursor = 'not-allowed';
        } else {
            prevButton.disabled = false;
            prevButton.style.opacity = '1';
            prevButton.style.cursor = 'pointer';
        }
        
        // Disable next button on last slide
        if (currentSlideIndex === slides.length - 1) {
            nextButton.disabled = true;
            nextButton.style.opacity = '0.5';
            nextButton.style.cursor = 'not-allowed';
        } else {
            nextButton.disabled = false;
            nextButton.style.opacity = '1';
            nextButton.style.cursor = 'pointer';
        }
    }
    
    // Syntax highlighting for HTML code
    function applySyntaxHighlighting() {
        document.querySelectorAll('.code-html').forEach(function(codeBlock) {
            let html = codeBlock.innerHTML;
            
            // Apply HTML syntax highlighting
            html = html.replace(/(&lt;[\/]?)([\w-]+)([^&]*?&gt;)/g, 
                               '<span class="tag">$1$2</span>$3');
            
            // Highlight attribute names
            html = html.replace(/(\s+)([\w-]+)(=)/g, 
                               '$1<span class="attr-name">$2</span>$3');
            
            // Highlight attribute values
            html = html.replace(/(=)(".*?")/g, 
                               '$1<span class="attr-value">$2</span>');
            
            // Highlight comments
            html = html.replace(/(&lt;!--.*?--&gt;)/g, 
                               '<span class="comment">$1</span>');
            
            codeBlock.innerHTML = html;
        });
    }
}); 