package UserIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "UserIntegration")
@SpringBootApplication
public class UserIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserIntegrationApplication.class, args);
	}

}
