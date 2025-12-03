window.onload = function() {

    const progressBar = document.getElementsByClassName('progress-bar');
    let width = 0;

    // Inicia un temporizador que se repite cada 50 milisegundos
    const interval = setInterval(function() {

        const pages = ["rutaA1.html", "rutaB1.html", "rutaC1.html"];
        const randomIndex = Math.floor(Math.random() * pages.length);

        if (width == 100) {

            // 1. Detiene el temporizador para que deje de ejecutarse
            clearInterval(interval);

            window.location.href = pages[randomIndex];
        
        } else {
            
            width++;
            
            progressBar.style.width = width + '%';
        }
    
    }, 50); // 50 indica la velocidad: se ejecuta cada 50 milisegundos

};