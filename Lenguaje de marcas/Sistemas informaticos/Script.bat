# Panel de accesos para entorno de desarrollo y documentación

Write-Host "=== PANEL DE ACCESO A HERRAMIENTAS Y RECURSOS ==="
Write-Host "1. Abrir presentación/Canva online"
Write-Host "2. Abrir archivo PDF de Canva"
Write-Host "3. Abrir GitHub"
Write-Host "4. Abrir Visual Studio Code"
Write-Host "5. Descargar Visual Studio Code"
Write-Host "6. Abrir carpeta proyectos Web (HTML/CSS/JS)"
Write-Host "7. Abrir IntelliJ IDEA"
Write-Host "8. Descargar IntelliJ IDEA"
Write-Host "9. Abrir navegador PDF (Chrome/Opera/Adobe)"
Write-Host "10. Abrir MySQL Workbench"
Write-Host "11. Descargar MySQL Workbench"
Write-Host "12. Descargar VirtualBox"
Write-Host "13. Instalar VirtualBox (instalador local)"
Write-Host "14. Abrir VirtualBox"
Write-Host "15. Descargar VMware Workstation"
Write-Host "16. Instalar VMware (instalador local)"
Write-Host "17. Abrir VMware Workstation"
Write-Host "18. Descargar ISO Windows 11 y Ubuntu Server"
Write-Host "19. Abrir carpeta Documentación/Proyecto"
Write-Host "0. Salir"

$opcion = Read-Host "Elige una opción"

switch ($opcion) {
    1 { Start-Process "https://www.canva.com" }
    2 { Start-Process "C:\RUTA\presentacion.pdf" }
    3 { Start-Process "https://github.com" }
    4 { Start-Process "C:\Users\$env:USERNAME\AppData\Local\Programs\Microsoft VS Code\Code.exe" }
    5 { Start-Process "https://code.visualstudio.com/download" }
    6 { Start-Process "C:\RUTA\PROYECTOS_WEB" }
    7 { Start-Process "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition\bin\idea64.exe" }
    8 { Start-Process "https://www.jetbrains.com/idea/download/" }
    9 { Start-Process "chrome.exe"; Start-Process "opera.exe"; Start-Process "Acrobat.exe" }
    10 { Start-Process "C:\Program Files\MySQL\MySQL Workbench 8.0 CE\MySQLWorkbench.exe" }
    11 { Start-Process "https://dev.mysql.com/downloads/workbench/" }
    12 { Start-Process "https://www.virtualbox.org/wiki/Downloads" }
    13 { Start-Process "C:\RUTA\VirtualBox-Installer.exe" }
    14 { Start-Process "C:\Program Files\Oracle\VirtualBox\VirtualBox.exe" }
    15 { Start-Process "https://www.vmware.com/products/workstation-player/workstation-player-evaluation.html" }
    16 { Start-Process "C:\RUTA\VMware-Installer.exe" }
    17 { Start-Process "C:\Program Files (x86)\VMware\VMware Player\vmplayer.exe" }
    18 { 
        Start-Process "https://www.microsoft.com/software-download/windows11"
        Start-Process "https://ubuntu.com/download/server"
      }
    19 { Start-Process "C:\RUTA\Documentacion_Proyecto" }
    0 { Exit }
    Default { Write-Host "Opción no válida" }
}

Pause
