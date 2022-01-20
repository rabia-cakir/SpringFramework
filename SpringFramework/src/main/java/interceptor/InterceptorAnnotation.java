package interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@InterceptorBindingAnnotation 
@Interceptor
public class InterceptorAnnotation {


	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("önceki durumum "+ context.getMethod().getName());
		
		boolean isLogin=true;
		Object isContinue=null;
		
		if(isLogin)
		{
			System.out.println("öncelikle üye olunuz");
		}else {
			
			try {
				
				isContinue=context.proceed();
				System.out.println("login olduktan sonra : yönlendirme yapılıyor, admin sayfasına gidiyorsunuz");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		
		
		return isContinue;
	}

}
