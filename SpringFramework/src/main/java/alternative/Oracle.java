package alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Oracle implements IDatabase{

	@Override
	public String dbName(String data) {
		// TODO Auto-generated method stub
		return "Oracle";
	}

}
