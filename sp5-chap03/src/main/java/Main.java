import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Client client1 = ctx.getBean("client",Client.class);
		Client client2 = ctx.getBean("client",Client.class);
		
		System.out.println(client1==client2);
		ctx.close();
	}
}
