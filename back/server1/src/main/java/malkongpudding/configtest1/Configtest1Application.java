package malkongpudding.configtest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Configtest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configtest1Application.class, args);
	}

}
