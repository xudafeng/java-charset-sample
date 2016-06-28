git_version = $$(git branch 2>/dev/null | sed -e '/^[^*]/d'-e's/* \(.*\)/\1/')

all: test
build:
	@java -version
	@echo JAVA_HOME: ${JAVA_HOME}
	@cd ./src/ && javac *.java && java Sample
jshint:
	@${npm_bin}/jshint .
.PHONY: test
