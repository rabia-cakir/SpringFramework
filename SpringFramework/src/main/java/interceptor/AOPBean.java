package interceptor;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named("interceptor")
@ApplicationScoped
public class AOPBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2076010616440392538L;
	private Login login;
	
	
	public String getLogin()
	{
		return login.isLogin("admin sayfası");
	}

}
