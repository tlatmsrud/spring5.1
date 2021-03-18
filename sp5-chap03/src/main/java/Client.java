import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements InitializingBean, DisposableBean{

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("spring container is dead!, bean is die");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean is created!");
	}
	
}
