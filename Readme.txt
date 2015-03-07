This Readme shows how to use iNear Prototype (Based on the Fairplay Framework)
Author: Ken Leung, Wiky Cheung
=======================================================

First Change current directory to root directory of iNear

B. Example for running Bob (should be first):
---------------------------------------------
java -classpath ./bin Bob -r progs/Nearness.txt daj5jafdd2 4

(-r for run,
 progs/Billionaires.txt - program to run,
 3rd parameter - crazy string for random seed,
 4th parameter - OT type [1-4], 4 is the best one)


C. Example for running Alice (should be second):
------------------------------------------------

java -classpath ./bin Alice -r progs/Nearness.txt grewrf6ui6 noHostname

(-r for run,
 progs/Billionaires.txt - program to run,
 3rd parameter - crazy string for random seed,
 4th parameter - no effect since there is no hostname (this parameter is to be removed)


D. Compile:
-------------------------
javac -d ./bin ./src/*.java

