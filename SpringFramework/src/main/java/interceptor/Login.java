package interceptor;

@InterceptorBindingAnnotation
public class Login {
	
	public String isLogin(String data)
	{
		return "executing "+ data;
	}

}
