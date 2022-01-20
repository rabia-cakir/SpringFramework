package alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("alternativeCdi")
@ApplicationScoped
public class ManagerJava {
	
	@Inject
	IDatabase database;
	
	public String getDbName()
	{
		return database.dbName("dbname :");
	}
	

}
