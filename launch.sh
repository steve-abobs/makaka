#!/bin/bash

OUT_DIR="out"

mkdir -p $OUT_DIR

find -name "*.java" > sources.txt
javac -d $OUT_DIR @sources.txt

java -cp $OUT_DIR com.zoo.Main

