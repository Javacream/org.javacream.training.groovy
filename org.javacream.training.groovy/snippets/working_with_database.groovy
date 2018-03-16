import java.sql.Statement;
import javax.sql.DataSource;
import org.hsqldb.jdbc.JDBCDataSource;
import groovy.sql.Sql

try{
	DataSource dataSource
	dataSource = new JDBCDataSource()
	dataSource.database = 'jdbc:hsqldb:hsql://10.127.202.89'
	dataSource.user = 'sa'
	dataSource.password = ''
	def sql = new Sql(dataSource)
	sql.execute "insert into messages values ('Hello from Groovy')"
	sql.eachRow("select message from messages", {message -> println(message)}) 
}
catch(def e){
	e.printStackTrace()
}