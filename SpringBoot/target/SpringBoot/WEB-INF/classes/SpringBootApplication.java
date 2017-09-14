import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
@SpringBootApplication
public class SpringBootApplication extends SpringBootServletInitializer{
	@override
	protected SpringBootApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(SpringBootApllication.class);
	}
	public static void main(Sting [] args)throws Exception
	{
		SpringBootApplication.run(SpringBootApplication.class,args);
	}

}
