package enumqualifier;



@EQualifier(EDatabase.MYSQL)
public class MySQL implements IDatabase{

	@Override
	public String dbName(String data) {
		// TODO Auto-generated method stub
		return "Optional MySQL";
	}

}
