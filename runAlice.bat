setlocal
cd /d %~dp0
java -classpath ./bin Alice -r progs/Nearness.txt grewrf6ui6 noHostname 1639 2639
set /p DUMMY=Press ENTER to exit...