@echo off
rem no print
cls
echo class num??
rem del *.class
set /p fname=
rem echo start compiling
mkdir dist 
javac -d dist Ex%fname%.java
cd dist
java Ex%fname%
cd ..
rmdir /s /q dist
pause
