package org.javacream.groovy.snippets;

import groovy.util.GroovyTestCase;
import groovy.text.SimpleTemplateEngine
class BuildReplaceTest extends GroovyTestCase {
	void testBuild(){
		def config = new ConfigSlurper().parse(new URL('file:///Y:/git/org.javacream.training.groovy/org.javacream.training.groovy/data/build_config.groovy'))
		def binding = ['url': config.database.url, 'user': config.database.username, 'pwd': config.database.pwd]
		File files = new File(config.directory.input)
		files.eachFile { templateFile ->
			def template = new SimpleTemplateEngine().createTemplate(templateFile);
			def result = template.make(binding)
			File outFile = new File("$config.directory.output/$templateFile.name")
			outFile << result.toString() 
			
			
		}
	}
}