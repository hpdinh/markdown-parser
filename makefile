target: dependency
	Action
	test: Markdown.class MDT.class
	javac -cp
MarkdownParse.class: Markdown.java
	javac Markdodwn.java
MarkdownParseTest.class: MarkdownParseTest.java MarkdownParse.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java