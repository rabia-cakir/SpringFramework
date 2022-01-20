package enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultDB implements IDatabase{

	@Override
	public String dbName(String data) {
		// TODO Auto-generated method stub
		return "Oracle";
	}

}
