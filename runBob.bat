setlocal
cd /d %~dp0
java -classpath ./bin Bob -r progs/Nearness.txt daj5jafdd2 4 1639 2639
set /p DUMMY=Press ENTER to exit...