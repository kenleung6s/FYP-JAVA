#!/bin/bash

for i in `seq 1 20`;
do
  let "r=$i+1000"
  (java -classpath ./bin Bob -r progs/Nearness.txt daj5jafdd2 4 $i $r &)
  sleep 1
  (java -classpath ./bin Alice -r progs/Nearness.txt grewrf6ui6 noHostname $i $r &)
done
