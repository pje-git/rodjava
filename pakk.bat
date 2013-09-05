@echo off
rem ============[ 2009-01-05 ]===============================[ Pawe³ Jacoñ ]==============
rem Nale¿y wkopiowaæ skrypt do katalogu, który chcemy spakowaæ i go uruchomiæ przez telnet
rem Powstanie spakowany plik w katalogu nadrzêdnym. 
rem Nazwa pliku:
rem   rrrr-mm-dd_ggmmss.rar 
rem       lub
rem   rrrr-mm-dd_ggmmss_nazwa.rar je¿eli podamy nazwê przy wywo³aniu skryptu
rem   jako parametr (opcjonalnie)
rem ======================================================================================
rem Przyklad: 
rem   Chcemy przeniesc katalog c:\xxx\yyy na inny komputer
rem   Wkopiowujemy skrypt do katalogu c:\xxx\yyy 
rem   uruchamiamy go z telneta: c:\xxx\yyy>pakuj_ten_katalog.bat moj_yyy
rem   otrzymujemy w katalogu c:\xxx plik 2009-01-05_091234_moj_yyy.rar
rem   jezeli nie podamy parametru moj_yyy otrzymamy plik 2009-01-05_091234.rar
rem   W tym przypadku, je¿eli chcemy zabezpieczyæ wiêcej katalogów w c:\xxx wszystkie zostan¹ 
rem   dodane do pliku 2009-01-05_091234.rar.
rem ======================================================================================

rem ==========| USTAWIENIA |===========
set prefix=""
set sufix="_ROD_D"

set katalog=%cd%
if NOT "%1" == "" goto jestpar
echo Brak parametru opcjonalnego.
goto brakpar
:jestpar
  set name=_%1
:brakpar

set czas1=%time:~0,2%
if /I %czas1% LSS 10 goto sp
goto nr
:sp
  set czas1=0%time:~1,1%
  goto end_time
:nr
  set czas1=%time:~0,2%
:end_time
set data_rrrrmmdd=%date:~0,4%%date:~5,2%%date:~8,2%
set data=%data_rrrrmmdd%_%czas1%%time:~3,2%%time:~6,2%
echo Archiwizacja katalogu %katalog% do pliku %prefix%%data%%name%%sufix%.rar ... czekac ...
echo **********************************************************
cd ..
"c:\Program Files\WinRAR\Rar.exe" a %prefix%%data%%name%%sufix% %katalog%
echo **********************************************************
echo Koniec archiwizacji ... bye bye ...

:end