package enumqualifier;


@EQualifier(EDatabase.POSTGRESQL)
public class PostgreSQL implements IDatabase{

	@Override
	public String dbName(String data) {
		// TODO Auto-generated method stub
		return "Optional PostgreSQL";
	}

}
