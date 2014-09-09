#Makefile

default: compile run

compile:
	@javac -J-Dfile.encoding=UTF8 AsteroidDetector.java

run:
	@java AsteroidDetector

test:
	java -jar sample/tester.jar -folder sample/traindata/ -train sample/supplemental/traindata.txt -test sample/supplemental/traindata.txt -exec make -seed 1 -vis 2

#test:
#	java -jar tester.jar -train traindata.txt -test traindata.txt -exec make -seed 1 -vis 1
