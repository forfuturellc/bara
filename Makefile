# Makefile for Developers
# Contains short-hand commands

# runs the web app
run:
	mvn clean install
	java -jar target/ROOT-local.war


.PHONY: run
