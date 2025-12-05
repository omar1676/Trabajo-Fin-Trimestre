window.onload = function() {

    const progressBar = document.getElementsByClassName('progress-bar');
    let width = 0;

   
    const interval = setInterval(function() {

        const pages = ["finalbueno.html",  "finalmalo.html","finalmedio.html"];
        const randomIndex = Math.floor(Math.random() * pages.length);

        if (width == 100) {

          
            clearInterval(interval);

            window.location.href = pages[randomIndex];
        
        } else {
            
            width++;
            
            progressBar.style.width = width + '%';
        }
    
    }, 50); 

};