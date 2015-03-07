#!/bin/bash
./runAlice | while IFS= read -r line; do echo "$(date +%H:%M:%S:%N) Alice - $line"; done >>log2.txt