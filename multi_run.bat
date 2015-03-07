SETLOCAL ENABLEDELAYEDEXPANSION
@echo off
cd /d %~dp0

for /l %%x in (1, 1, 10) do (   
  set /a send=%%x
  set /a receive=%%x+100
  start java -classpath ./bin Bob -r progs/Nearness.txt daj5jafdd2 4 !send! !receive!
  start java -classpath ./bin Alice -r progs/Nearness.txt grewrf6ui6 noHostname !send! !receive!
)
set /p DUMMY=Press ENTER to exit...

