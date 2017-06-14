#!/usr/bin/env bash
rm *.class
rm baz/*.class
javac CCLRunner.java
javac CompilingClassLoader.java
java CCLRunner FirstLoadedClass hello world