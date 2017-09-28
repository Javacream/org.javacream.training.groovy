package org.javacream.groovy.util;

import groovy.util.GroovyTestCase;

class DaoTest extends GroovyTestCase {

	void testDao(){
		def dao = new Dao();

		dao.doInStatement {statement ->
			statement.executeUpdate("insert into messages values ('TEST2')")
		}
	}
}
