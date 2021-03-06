import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx {

	@Bean
	@Scope("prototype")
	public Client client() {
		Client client = new Client();
		return client;
	}
	
	@Bean(initMethod = "create", destroyMethod="destroy")
	public Client2 client2() {
		Client2 client = new Client2();
		return client;
	}
}
