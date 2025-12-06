@echo off
title Trabajo Final 
chcp 65001
cls

:menu
color 07
cls
echo.
echo ██╗      ██╗
echo ╚██╗    ██╔╝  ████████╗ █████╗ ██████╗ ████████╗
echo  ╚██╗  ██╔╝  ╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝
echo   ╚██ ██╔╝      ██║   ███████║██████╔╝   ██║
echo   ██╔  ██╗      ██║   ██║  ██║██╔══██║   ██║
echo  ██╔╝   ██╗     ██║   ██║  ██║██║  ██║   ██║
echo ██╔╝     ██╗    ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝
echo ╚═╝      ╚═╝
echo.
echo  ██████╗ ██████╗ ██╗   ██╗██████╗  ██████╗     ██╗   ██╗ █████╗ ██╗    ██╗
echo ██╔════╝ ██╔══██╗██║   ██║██╔══██╗██╔═══██╗    ██║   ██║██╔══██╗╚██╗  ██╔╝
echo ██║  ███╗██████╔╝██║   ██║██████╔╝██║   ██║    ██║   ██║███████║ ╚██ ██╔╝ 
echo ██║   ██║██╔══██╗██║   ██║██╔═══╝ ██║   ██║    ██║   ██║██╔══██║ ██╔  ██╗ 
echo ╚██████╔╝██║  ██║╚██████╔╝██║     ╚██████╔╝    ╚██████╔╝██║  ██║██╔╝   ██╗
echo  ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝      ╚═════╝      ╚═════╝ ╚═╝  ╚═╝╚═╝    ╚═╝
echo.
echo ===============================
echo 1. Acceso a presentacion Canva (online)
echo 2. Acceso a Canva descargado (PDF)
echo 3. Acceso a GitHub
echo 4. Abrir Visual Studio Code
echo 5. Acceso a descarga de Visual Studio Code
echo 6. Abrir documentos HTM, CSS y JS
echo 7. Abrir IntelliJ
echo 8. Acceso descarga IntelliJ
echo 9. Abrir PDF (Adobe/Chrome/Opera)
echo 10. Abrir MySQL Workbench
echo 11. Acceso descarga MySQL Workbench
echo 12. Acceso descarga VirtualBox
echo 13. Instalar VirtualBox
echo 14. Abrir VirtualBox
echo 15. Acceso descarga VMware
echo 16. Instalar VMware
echo 17. Abrir VMware
echo 18. Descarga Windows 11 y Ubuntu Server
echo 19. Acceso a Documentación/Memoria/Aplicación
echo 0. Salir
echo ===============================
echo.
set /p opcion=Selecciona una opcion: 

if "%opcion%"=="1" goto canva
if "%opcion%"=="2" goto canva_pdf
if "%opcion%"=="3" goto github
if "%opcion%"=="4" goto vscode
if "%opcion%"=="5" goto vscode_download
if "%opcion%"=="6" goto webdocs
if "%opcion%"=="7" goto intellij
if "%opcion%"=="8" goto intellij_download
if "%opcion%"=="9" goto pdf
if "%opcion%"=="10" goto mysql
if "%opcion%"=="11" goto mysql_download
if "%opcion%"=="12" goto vbox_download
if "%opcion%"=="13" goto vbox_install
if "%opcion%"=="14" goto vbox_open
if "%opcion%"=="15" goto vmware_download
if "%opcion%"=="16" goto vmware_install
if "%opcion%"=="17" goto vmware_open
if "%opcion%"=="18" goto isos
if "%opcion%"=="19" goto docs
if "%opcion%"=="0" exit
goto menu

:canva
color 90
echo  ██████╗ █████╗ ███╗   ██╗██╗   ██╗ █████╗ 
echo ██╔════╝██╔══██╗████╗  ██║██║   ██║██╔══██╗
echo ██║     ███████║██╔██╗ ██║██║   ██║███████║
echo ██║     ██╔══██║██║╚██╗██║╚██╗ ██╔╝██╔══██║
echo ╚██████╗██║  ██║██║ ╚████║ ╚████╔╝ ██║  ██║
echo  ╚═════╝╚═╝  ╚═╝╚═╝  ╚═══╝  ╚═══╝  ╚═╝  ╚═╝
set /p respuesta=¿Quieres iniciar Canva? (s/n): 
if /i "%respuesta%"=="s" start "" "https://www.canva.com/"
goto menu

:canva_pdf
color c9
echo  ██████╗ █████╗ ███╗   ██╗██╗   ██╗ █████╗ 
echo ██╔════╝██╔══██╗████╗  ██║██║   ██║██╔══██╗
echo ██║     ███████║██╔██╗ ██║██║   ██║███████║
echo ██║     ██╔══██║██║╚██╗██║╚██╗ ██╔╝██╔══██║
echo ╚██████╗██║  ██║██║ ╚████║ ╚████╔╝ ██║  ██║
echo  ╚═════╝╚═╝  ╚═╝╚═╝  ╚═══╝  ╚═══╝  ╚═╝  ╚═╝
echo.
echo ██████╗ ██████╗ ███████╗
echo ██╔══██╗██╔══██╗██╔════╝
echo ██████╔╝██║  ██║█████╗
echo ██╔═══╝ ██║  ██║██╔══╝
echo ██║     ██████╔╝██║
echo ╚═╝     ╚═════╝ ╚═╝
echo.
set /p respuesta=¿Quieres abrir Canva PDF? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Users\alvar\OneDrive\Escritorio\Clases\SISTEMAS INFORMATICOS\Scriptfinal\Nuria.pdf"
goto menu

:github
color 08
echo ██████████████████████
echo ███ █████████ ████████
echo ███  ████████  ███████
echo ██                 ███
echo ██                  ██
echo █                   ██
echo █                   ██ 
echo ██                  ██
echo ██                  ██
echo ███                ███
echo ███████      █████████
echo ██████         ███████
echo █████            █████
echo █ ██               ███
echo █  █                ██
echo ██  █               ██
echo ███                 ██
echo ████                ██
echo ██████████████████████
echo.
set /p respuesta=¿Quieres abrir GitHub? (s/n): 
if /i "%respuesta%"=="s" start "" "https://github.com/"
goto menu

:vscode
color 1f
echo ██████████████████████████
echo ████████████████  ████████
echo ██████  ███████    ███████
echo ██████    ████       █████
echo ███████     █    █   █████
echo ████████        ██   █████
echo ██████████     ███   █████
echo ████████        ██   █████
echo ███████     █    █   █████
echo ██████    ████       █████
echo ██████  ███████    ███████
echo ████████████████  ████████
echo ██████████████████████████
echo.
set /p respuesta=¿Quieres abrir Visual Studio Code? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Users\alvar\AppData\Local\Programs\Microsoft VS Code\Code.exe"
goto menu

:vscode_download
color 1f
echo ██╗   ██╗███████╗ ██████╗
echo ██║   ██║██╔════╝██╔════╝
echo ██║   ██║███████╗██║
echo ╚██╗ ██╔╝╚════██║██║
echo  ╚████╔╝ ███████║╚██████╗
echo   ╚═══╝  ╚══════╝ ╚═════╝
echo.
set /p respuesta=¿Quieres abrir la descarga de VS Code? (s/n): 
if /i "%respuesta%"=="s" start "" "https://code.visualstudio.com/download"
goto menu

:webdocs
color 4d
echo ██╗  ██╗████████╗███╗   ███╗        ██████╗███████╗███████╗            ██╗███████╗
echo ██║  ██║╚══██╔══╝████╗ ████║       ██╔════╝██╔════╝██╔════╝            ██║██╔════╝
echo ███████║   ██║   ██╔████╔██║       ██║     ███████╗███████╗            ██║███████╗
echo ██╔══██║   ██║   ██║╚██╔╝██║       ██║     ╚════██║╚════██║       ██   ██║╚════██║
echo ██║  ██║   ██║   ██║ ╚═╝ ██║▄█╗    ╚██████╗███████║███████║▄█╗    ╚█████╔╝███████║
echo ╚═╝  ╚═╝   ╚═╝   ╚═╝     ╚═╝╚═╝     ╚═════╝╚══════╝╚══════╝╚═╝     ╚════╝ ╚══════╝
echo.
set /p respuesta=¿Quieres abrir tus documentos HTML/CSS/JS? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Users\alvar\OneDrive\Escritorio\Clases\LENGUAJE DE MARCAS"
goto menu

:intellij
color 58
echo MMMMMMMMMMMWMMMMXdc:::::::::::::::::::::::::::::cd
echo WWNNNNNNNNNNNWWXd:::::::::::::::::::::::::::::::::
echo 0kkkxxxkkkxxkO0d::::::::::::::::::::::::::::::::::
echo dddddddddddddolc::::::::::::::::::::::::::::::::::
echo ddddddddl,''''...........................;::::::::
echo dddddddd:.                               '::::::::
echo ddddoooo:.  .lddddd;     ;dd,             ':::::::
echo oooooooo;   .;oKWkc'    .xMMo             ':::::::
echo oooooloo:.    .kN:      .xMMo             ,:::::::
echo oloolllo;.    .kNc      .xMWo             ,:::::::
echo xlllllll;     .ONc      'OMWl             ,:::::::
echo klllllcc,   'dOXWKO: 'ok0K0d.             ,:::::::
echo 0llcclcc,   .,;;;;;. .,;,..               ,:::::::
echo Kocccccc,                                ,::::::::
echo Nd:ccc:c,                                ,::::::::
echo Wkccc:::,                                ,:::::::o
echo M0c©::,    .............               ,::::lx0N
echo MKo:::::,   'k0000000000kd,              ,:cldKWMM
echo MNx:::::,    .............               ;oodkNWWM
echo MWOc©:,.                              .cdddkNWWM
echo MMKl::::;;;;;;;;;;;;;;;;;;;;;;;;;;;:cllllodddkNMMM
echo MMXd::::::::::::::::::::::::::ccloodddddddddx0NMMM
echo MMWkc:::::::::::::::::::©clx0KKK00000KKK0KXWMMMM
echo MMW0l::::::::::::::::::clox0XWMMMMMMMMMMMMMMMMMMMM
echo MMWNOc:::::::::::::©cxKNWMMMMMMMMMMMMMMMMMMMMMMM
echo.x
set /p respuesta=¿Quieres abrir IntelliJ? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\ProgramData\Microsoft\Windows\Start Menu\Programs\JetBrains\IntelliJ IDEA 2025.2.2.lnk"
goto menu

:intellij_download
color 7a
echo ██╗███╗   ██╗████████╗███████╗██╗     ██╗     ██╗     ██╗
echo ██║████╗  ██║╚══██╔══╝██╔════╝██║     ██║     ██║     ██║
echo ██║██╔██╗ ██║   ██║   █████╗  ██║     ██║     ██║     ██║
echo ██║██║╚██╗██║   ██║   ██╔══╝  ██║     ██║     ██║██   ██║
echo ██║██║ ╚████║   ██║   ███████╗███████╗███████╗██║╚█████╔╝
echo ╚═╝╚═╝  ╚═══╝   ╚═╝   ╚══════╝╚══════╝╚══════╝╚═╝ ╚════╝
set /p respuesta=¿Quieres abrir la descarga de IntelliJ? (s/n): 
if /i "%respuesta%"=="s" start "" "https://www.jetbrains.com/idea/download/"
goto menu

:pdf
color 4f
echo ██████╗ ██████╗ ███████╗
echo ██╔══██╗██╔══██╗██╔════╝
echo ██████╔╝██║  ██║█████╗
echo ██╔═══╝ ██║  ██║██╔══╝
echo ██║     ██████╔╝██║
echo ╚═╝     ╚═════╝ ╚═╝
set /p respuesta=¿Quieres abrir un PDF? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Users\TU_USUARIO\Documents\archivo.pdf"
goto menu

:mysql
color 1c
echo ██████████████████████████
echo ███   ████████████████████
echo ████    ██████████████████
echo █████ ██  ████████████████
echo ██████ ██   ██████████████
echo ██████ ████   █████  █████
echo ███████ █ ███   ██ █ █████
echo ██████ ████████   ██ █████
echo █████ █ ███████████ ██████
echo █████  █ ███████████  ████
echo ████████ ███████████  ████
echo █████████████████████  ███
echo ███████████████████████  █
echo.
set /p respuesta=¿Quieres abrir MySQL Workbench? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Program Files\MySQL\MySQL Workbench 8.0 CE\MySQLWorkbench.exe"
goto menu

:mysql_download
color 1c
echo ███╗   ███╗██╗   ██╗  ███████╗ ██████╗ ██╗
echo ████╗ ████║╚██╗ ██╔╝  ██╔════╝██╔═══██╗██║
echo ██╔████╔██║ ╚████╔╝   ███████╗██║   ██║██║
echo ██║╚██╔╝██║  ╚██╔╝    ╚════██║██║▄▄ ██║██║
echo ██║ ╚═╝ ██║   ██║     ███████║╚██████╔╝███████╗
echo ╚═╝     ╚═╝   ╚═╝     ╚══════╝ ╚══▀▀═╝ ╚══════╝
echo.
set /p respuesta=¿Quieres abrir la descarga de MySQL Workbench? (s/n): 
if /i "%respuesta%"=="s" start "" "https://dev.mysql.com/downloads/workbench/"
goto menu

:vbox_download
color e5
echo █      ███████     █████
echo █  ██  ██████  ██  █████
echo ██  ██  ████  ███  █████
echo ███  ██  ██        █████
echo ████  ██████████████████
echo ████  ██████████████████
echo █████  █████████████████
echo █████  █████████████████
echo ██████  ██████      ████
echo ██████  █████  ███  ████
echo ███████  ████  ███  ████
echo ███████  ███  ████  ████
echo ████████      ██    ████
echo.
set /p respuesta=¿Quieres abrir la descarga de VirtualBox? (s/n): 
if /i "%respuesta%"=="s" start "" "https://www.virtualbox.org/wiki/Downloads"
goto menu

:vbox_install
echo 5e
echo ██╗   ██╗██╗██████╗ ████████╗██╗   ██╗ █████╗ ██╗     ██████╗  ██████╗ ██╗  ██╗
echo ██║   ██║██║██╔══██╗╚══██╔══╝██║   ██║██╔══██╗██║     ██╔══██╗██╔═══██╗╚██╗██╔╝
echo ██║   ██║██║██████╔╝   ██║   ██║   ██║███████║██║     ██████╔╝██║   ██║ ╚███╔╝ 
echo ╚██╗ ██╔╝██║██╔══██╗   ██║   ██║   ██║██╔══██║██║     ██╔══██╗██║   ██║ ██╔██╗ 
echo  ╚████╔╝ ██║██║  ██║   ██║   ╚██████╔╝██║  ██║███████╗██████╔╝╚██████╔╝██╔╝ ██╗
echo   ╚═══╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝
echo.
set /p respuesta=¿Quieres instalar VirtualBox? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Users\alvar\Downloads\VirtualBox-7.2.2-170484-Win.exe"
goto menu

:vbox_open
color 29 
echo ██╗   ██╗██╗██████╗ ████████╗██╗   ██╗ █████╗ ██╗     ██████╗  ██████╗ ██╗  ██╗
echo ██║   ██║██║██╔══██╗╚══██╔══╝██║   ██║██╔══██╗██║     ██╔══██╗██╔═══██╗╚██╗██╔╝
echo ██║   ██║██║██████╔╝   ██║   ██║   ██║███████║██║     ██████╔╝██║   ██║ ╚███╔╝ 
echo ╚██╗ ██╔╝██║██╔══██╗   ██║   ██║   ██║██╔══██║██║     ██╔══██╗██║   ██║ ██╔██╗ 
echo  ╚████╔╝ ██║██║  ██║   ██║   ╚██████╔╝██║  ██║███████╗██████╔╝╚██████╔╝██╔╝ ██╗
echo   ╚═══╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝
echo.
set /p respuesta=¿Quieres abrir VirtualBox? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Program Files\Oracle\VirtualBox\VirtualBox.exe"
goto menu

:vmware_download
color f4
echo ██╗   ██╗███╗   ███╗██╗    ██╗ █████╗ ██████╗ ███████╗
echo ██║   ██║████╗ ████║██║    ██║██╔══██╗██╔══██╗██╔════╝
echo ██║   ██║██╔████╔██║██║ █╗ ██║███████║██████╔╝█████╗
echo ╚██╗ ██╔╝██║╚██╔╝██║██║███╗██║██╔══██║██╔══██╗██╔══╝
echo  ╚████╔╝ ██║ ╚═╝ ██║╚███╔███╔╝██║  ██║██║  ██║███████╗
echo   ╚═══╝  ╚═╝     ╚═╝ ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝
echo.
set /p respuesta=¿Quieres abrir la descarga de VMware? (s/n): 
if /i "%respuesta%"=="s" start "" "https://www.vmware.com/products/workstation-player.html"
goto menu

:vmware_install
color 4f
echo ██╗   ██╗███╗   ███╗██╗    ██╗ █████╗ ██████╗ ███████╗
echo ██║   ██║████╗ ████║██║    ██║██╔══██╗██╔══██╗██╔════╝
echo ██║   ██║██╔████╔██║██║ █╗ ██║███████║██████╔╝█████╗
echo ╚██╗ ██╔╝██║╚██╔╝██║██║███╗██║██╔══██║██╔══██╗██╔══╝
echo  ╚████╔╝ ██║ ╚═╝ ██║╚███╔███╔╝██║  ██║██║  ██║███████╗
echo   ╚═══╝  ╚═╝     ╚═╝ ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝
echo.
set /p respuesta=¿Quieres instalar VMware? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Users\alvar\Downloads\VMware_Player_V17.6.3 2.exe"
goto menu

:vmware_open
color 0c
echo ██╗   ██╗███╗   ███╗██╗    ██╗ █████╗ ██████╗ ███████╗
echo ██║   ██║████╗ ████║██║    ██║██╔══██╗██╔══██╗██╔════╝
echo ██║   ██║██╔████╔██║██║ █╗ ██║███████║██████╔╝█████╗
echo ╚██╗ ██╔╝██║╚██╔╝██║██║███╗██║██╔══██║██╔══██╗██╔══╝
echo  ╚████╔╝ ██║ ╚═╝ ██║╚███╔███╔╝██║  ██║██║  ██║███████╗
echo   ╚═══╝  ╚═╝     ╚═╝ ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝
echo.
set /p respuesta=¿Quieres abrir VMware? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\ProgramData\Microsoft\Windows\Start Menu\Programs\VMware\VMware Workstation 17 Player.lnk"
goto menu

:isos
color 0e
echo ██╗    ██╗██╗███╗   ██╗██████╗  ██████╗ ██╗    ██╗███████╗     ██╗ ██╗
echo ██║    ██║██║████╗  ██║██╔══██╗██╔═══██╗██║    ██║██╔════╝    ███║███║
echo ██║ █╗ ██║██║██╔██╗ ██║██║  ██║██║   ██║██║ █╗ ██║███████╗    ╚██║╚██║
echo ██║███╗██║██║██║╚██╗██║██║  ██║██║   ██║██║███╗██║╚════██║     ██║ ██║
echo ╚███╔███╔╝██║██║ ╚████║██████╔╝╚██████╔╝╚███╔███╔╝███████║     ██║ ██║
echo  ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝  ╚══╝╚══╝ ╚══════╝     ╚═╝ ╚═╝
echo.
echo ██╗   ██╗██████╗ ██╗   ██╗███╗   ██╗████████╗██╗   ██╗    ███████╗███████╗██████╗ ██╗   ██╗███████╗██████╗ 
echo ██║   ██║██╔══██╗██║   ██║████╗  ██║╚══██╔══╝██║   ██║    ██╔════╝██╔════╝██╔══██╗██║   ██║██╔════╝██╔══██╗
echo ██║   ██║██████╔╝██║   ██║██╔██╗ ██║   ██║   ██║   ██║    ███████╗█████╗  ██████╔╝██║   ██║█████╗  ██████╔╝
echo ██║   ██║██╔══██╗██║   ██║██║╚██╗██║   ██║   ██║   ██║    ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██╔══╝  ██╔══██╗
echo ╚██████╔╝██████╔╝╚██████╔╝██║ ╚████║   ██║   ╚██████╔╝    ███████║███████╗██║  ██║ ╚████╔╝ ███████╗██║  ██║
echo  ╚═════╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═══╝   ╚═╝    ╚═════╝     ╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝  ╚═╝
set /p respuesta=¿Quieres abrir descargas de Windows 11 y Ubuntu? (s/n): 
if /i "%respuesta%"=="s" (
    start "" "https://www.microsoft.com/software-download/windows11"
    start "" "https://ubuntu.com/download/server"
)
goto menu

:docs
color 03
echo ██████╗  ██████╗  ██████╗██╗   ██╗███╗   ███╗███████╗███╗   ██╗████████╗ █████╗  ██████╗██╗███╗   ██╗
echo ██╔══██╗██╔═══██╗██╔════╝██║   ██║████╗ ████║██╔════╝████╗  ██║╚══██╔══╝██╔══██╗██╔════╝██║████╗  ██║
echo ██║  ██║██║   ██║██║     ██║   ██║██╔████╔██║█████╗  ██╔██╗ ██║   ██║   ███████║██║     ██║██╔██╗ ██║
echo ██║  ██║██║   ██║██║     ██║   ██║██║╚██╔╝██║██╔══╝  ██║╚██╗██║   ██║   ██╔══██║██║     ██║██║╚██╗██║
echo ██████╔╝╚██████╔╝╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗██║ ╚████║   ██║   ██║  ██║╚██████╗██║██║ ╚████║
echo ╚═════╝  ╚═════╝  ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝╚═╝╚═╝  ╚═══╝
echo.
set /p respuesta=¿Quieres abrir la documentación del proyecto? (s/n): 
if /i "%respuesta%"=="s" start "" "C:\Users\TU_USUARIO\Documents\Documentacion"
goto menu
