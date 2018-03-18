package org.javacream.groovy.util

import java.sql.Statement

import javax.sql.DataSource

import org.hsqldb.jdbc.JDBCDataSource

class Dao {
	DataSource source
	{
		source = new JDBCDataSource()
		source.database = 'jdbc:hsqldb:hsql://localhost'
		source.user = 'sa'
		source.password = ''
	}

	def doInStatement(Closure c){
		def con = source.getConnection()
		Statement statement = con.createStatement()
		def result = c.call statement
		statement.close()
		con.close()
		return result
	}	
}
