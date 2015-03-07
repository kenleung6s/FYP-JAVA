#!/bin/bash
./runBob | while IFS= read -r line; do echo "$(date +%H:%M:%S:%N) Bob - $line"; done >>log2.txt