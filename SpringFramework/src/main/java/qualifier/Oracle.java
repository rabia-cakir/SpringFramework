package qualifier;

import javax.enterprise.inject.Default;

@Default
public class Oracle implements IDatabase{

	@Override
	public String dbName(String data) {
		// TODO Auto-generated method stub
		return "Oracle";
	}

}
