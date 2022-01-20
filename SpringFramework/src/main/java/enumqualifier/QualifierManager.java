package enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("multipleQualifier")
@ApplicationScoped
public class QualifierManager {
	
	
	@Inject
	@EQualifier(EDatabase.MYSQL)
	IDatabase database;
	
	public String getDBName()
	{
		return database.dbName("seçim : ");
	}

}
