@echo off
title Accesos del Proyecto - Sistemas Informáticos

:: ---------- MENSAJE INICIAL ----------
powershell -command "[System.Windows.MessageBox]::Show('Iniciando el script de accesos. Pulsa Aceptar para continuar.','Inicio del Script','OK','Information')"

echo.
echo ██╗  ██╗███████╗████████╗ █████╗ ██████╗ ████████╗
echo ╚██╗██╔╝██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝
echo  ╚███╔╝ ███████╗   ██║   ███████║██████╔╝   ██║   
echo  ██╔██╗ ╚════██║   ██║   ██╔══██║██╔══██╗   ██║   
echo ██╔╝ ██╗███████║   ██║   ██║  ██║██║  ██║   ██║   
echo ╚═╝  ╚═╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝   
echo.                                       

echo ===============================================
echo       MENU DE ACCESOS AUTOMÁTICOS
echo ===============================================
echo.

echo 1. Acceso a presentacion Canva (online)
echo 2. Acceso a Canva descargado (PDF)
echo 3. Acceso a GitHub
echo 4. Acceso a Visual Studio Code
echo 5. Acceso a descarga de Visual Studio Code
echo 6. Acceso documentos HTM, CSS, JS
echo 7. Acceso a IntelliJ
echo 8. Acceso descarga IntelliJ
echo 9. Acceso a Adobe/Chrome/Opera (PDF)
echo 10. Acceso a MySQL Workbench
echo 11. Acceso descarga MySQL Workbench
echo 12. Acceso descarga VirtualBox
echo 13. Instalación VirtualBox
echo 14. Abrir VirtualBox
echo 15. Acceso descarga VMware
echo 16. Instalación VMware
echo 17. Abrir VMware
echo 18. Acceso descarga Windows 11 y Ubuntu Server
echo 19. Acceso a Documentación/Aplicación
echo 0. Salir
echo.

set /p opc=Selecciona una opcion: 

if %opc%==1 start https://www.canva.com/
if %opc%==2 start "" "C:\Users\TU_USUARIO\Downloads\presentacion.pdf"
if %opc%==3 start https://github.com/
if %opc%==4 start "" "C:\Users\TU_USUARIO\AppData\Local\Programs\Microsoft VS Code\Code.exe"
if %opc%==5 start https://code.visualstudio.com/download
if %opc%==6 start "" "C:\Users\TU_USUARIO\Documents\proyecto_web"
if %opc%==7 start "" "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition\bin\idea64.exe"
if %opc%==8 start https://www.jetbrains.com/idea/download/
if %opc%==9 start "" "C:\Program Files\Google\Chrome\Application\chrome.exe" "C:\ruta\archivo.pdf"
if %opc%==10 start "" "C:\Program Files\MySQL\MySQL Workbench 8.0 CE\MySQLWorkbench.exe"
if %opc%==11 start https://dev.mysql.com/downloads/workbench/
if %opc%==12 start https://www.virtualbox.org/wiki/Downloads
if %opc%==13 start "" "C:\Users\TU_USUARIO\Downloads\VirtualBox-setup.exe"
if %opc%==14 start "" "C:\Program Files\Oracle\VirtualBox\VirtualBox.exe"
if %opc%==15 start https://www.vmware.com/products/workstation-player.html
if %opc%==16 start "" "C:\Users\TU_USUARIO\Downloads\VMware-setup.exe"
if %opc%==17 start "" "C:\Program Files (x86)\VMware\VMware Workstation\vmware.exe"
if %opc%==18 (
    start https://www.microsoft.com/software-download/windows11
    start https://ubuntu.com/download/server
)
if %opc%==19 start "" "C:\Users\TU_USUARIO\Documents\documentacion_proyecto"

if %opc%==0 goto final

echo.
echo Opcion no valida
pause
goto final

:final

:: ---------- MENSAJE FINAL ----------
powershell -command "[System.Windows.MessageBox]::Show('El script ha finalizado correctamente.','Fin del Script','OK','Information')"
exit
