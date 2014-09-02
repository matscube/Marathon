#Makefile

default: compile run

compile:
	javac -J-Dfile.encoding=UTF8 AsteroidDetector.java

run:
	java AsteroidDetector

test:
	java -jar sample/tester.jar -folder "sample/supplemental/" -train "sample/supplemental/traindata.txt" -test "sample/supplemental/Amors.txt" -exec "make" -seed 0 -vis 0