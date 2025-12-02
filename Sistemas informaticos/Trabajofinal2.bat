@echo off
title Trabajo final

:: MENSAJE INICIAL
powershell -command "[System.Windows.MessageBox]::Show('Iniciando el script.','Inicio','OK','Information')"

:menu
cls
echo ===============================
echo        MENU DE ACCESOS
echo ===============================
echo.
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
echo.
set /p opc=Selecciona una opcion: 

:: ===========================================================
::              OPCIÓN 1 – CANVA ONLINE
:: ===========================================================
if %opc%==1 (
    echo.
    echo ¿Quieres iniciar Canva online? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start https://www.canva.com/
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::              OPCIÓN 2 – CANVA PDF
:: ===========================================================
if %opc%==2 (
    echo.
    echo ¿Quieres abrir Canva PDF descargado? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Users\TU_USUARIO\Downloads\presentacion.pdf"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::              OPCIÓN 3 – GITHUB
:: ===========================================================
if %opc%==3 (
    echo.
    echo ¿Quieres abrir GitHub? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start https://github.com/
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::              OPCIÓN 4 – VISUAL STUDIO CODE
:: ===========================================================
if %opc%==4 (
    echo.
    echo ¿Quieres abrir Visual Studio Code? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Users\TU_USUARIO\AppData\Local\Programs\Microsoft VS Code\Code.exe"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::           OPCIÓN 5 – DESCARGA VS CODE
:: ===========================================================
if %opc%==5 (
    echo.
    echo ¿Quieres ir a la descarga de Visual Studio Code? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start https://code.visualstudio.com/download
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::       OPCIÓN 6 – ARCHIVOS HTML/CSS/JS
:: ===========================================================
if %opc%==6 (
    echo.
    echo ¿Quieres abrir tus documentos HTML, CSS y JS? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Users\TU_USUARIO\Documents\proyecto_web"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::                OPCIÓN 7 – INTELLIJ
:: ===========================================================
if %opc%==7 (
    echo.
    echo ¿Quieres abrir IntelliJ? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition\bin\idea64.exe"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::          OPCIÓN 8 – DESCARGA INTELLIJ
:: ===========================================================
if %opc%==8 (
    echo.
    echo ¿Quieres abrir la descarga de IntelliJ? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start https://www.jetbrains.com/idea/download/
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::         OPCIÓN 9 – ABRIR PDF
:: ===========================================================
if %opc%==9 (
    echo.
    echo ¿Quieres abrir el PDF? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Program Files\Google\Chrome\Application\chrome.exe" "C:\ruta\archivo.pdf"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu 
    pause
    goto menu
)

:: ===========================================================
::         OPCIÓN 10 – MYSQL WORKBENCH
:: ===========================================================
if %opc%==10 (
    echo.
    echo ¿Quieres abrir MySQL Workbench? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Program Files\MySQL\MySQL Workbench 8.0 CE\MySQLWorkbench.exe"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::       OPCIÓN 11 – DESCARGA MYSQL WORKBENCH
:: ===========================================================
if %opc%==11 (
    echo.
    echo ¿Quieres ir a la descarga de MySQL Workbench? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start https://dev.mysql.com/downloads/workbench/
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::         OPCIÓN 12 – DESCARGA VIRTUALBOX
:: ===========================================================
if %opc%==12 (
    echo.
    echo ¿Quieres ir a la descarga de VirtualBox? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start https://www.virtualbox.org/wiki/Downloads
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::          OPCIÓN 13 – INSTALAR VIRTUALBOX
:: ===========================================================
if %opc%==13 (
    echo.
    echo ¿Quieres instalar VirtualBox? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Users\TU_USUARIO\Downloads\VirtualBox-setup.exe"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::            OPCIÓN 14 – ABRIR VIRTUALBOX
:: ===========================================================
if %opc%==14 (
    echo.
    echo ¿Quieres abrir VirtualBox? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Program Files\Oracle\VirtualBox\VirtualBox.exe"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::            OPCIÓN 15 – DESCARGA VMWARE
:: ===========================================================
if %opc%==15 (
    echo.
    echo ¿Quieres ir a la descarga de VMware? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start https://www.vmware.com/products/workstation-player.html
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::            OPCIÓN 16 – INSTALAR VMWARE
:: ===========================================================
if %opc%==16 (
    echo.
    echo ¿Quieres instalar VMware? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Users\TU_USUARIO\Downloads\VMware-setup.exe"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::            OPCIÓN 17 – ABRIR VMWARE
:: ===========================================================
if %opc%==17 (
    echo.
    echo ¿Quieres abrir VMware? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Program Files (x86)\VMware\VMware Workstation\vmware.exe"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::   OPCIÓN 18 – DESCARGA WINDOWS 11 Y UBUNTU SERVER
:: ===========================================================
if %opc%==18 (
    echo.
    echo ¿Quieres abrir las descargas de Windows 11 y Ubuntu Server? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start https://www.microsoft.com/software-download/windows11
        start https://ubuntu.com/download/server
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::   OPCIÓN 19 – DOCUMENTACIÓN DEL PROYECTO
:: ===========================================================
if %opc%==19 (
    echo.
    echo ¿Quieres abrir la documentación del proyecto? (s/n)
    set /p respuesta=

    if /i "%respuesta%"=="s" (
        start "" "C:\Users\TU_USUARIO\Documents\documentacion_proyecto"
        goto menu
    )
    if /i "%respuesta%"=="n" goto menu

    echo Volviendo al menu
    pause
    goto menu
)

:: ===========================================================
::             OPCIÓN 0 – SALIR
:: ===========================================================
if %opc%==0 goto final

echo.
echo Opción no válida
pause
goto menu


:final
powershell -command "[System.Windows.MessageBox]::Show('El script ha terminado.','Fin','OK','Information')"
exit
