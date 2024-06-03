document.addEventListener('DOMContentLoaded', function() {
    const images = [
        'images/teslaafix.jpg',
        'images/teslamodel3.jpg',
        'images/teslamodels.jpg',
        'images/icon.jpg',
        'images/Tesla S.jpg',
        'images/teslamodely.jpg'
        // Add more image paths as needed
    ];
    
    let currentIndex = 0;
    const imageElement = document.getElementById('imagechanger');
    const button = document.getElementById('change-image-button');
    
    button.addEventListener('click', function() {
        currentIndex = (currentIndex + 1) % images.length;
        imageElement.src = images[currentIndex];
    });
});
