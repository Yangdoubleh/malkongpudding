package malkongpudding.configtest1;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class Configtest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Configtest1Application.class, args);
	}

}
