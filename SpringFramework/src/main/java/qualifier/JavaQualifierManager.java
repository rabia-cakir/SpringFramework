package qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("qualifierCdi")
@ApplicationScoped
public class JavaQualifierManager {
	
	@Inject
	@QualifierAnnotation
	IDatabase database;
	
	public String getDbName()
	{
		return database.dbName("dbname : ");
	}

}
