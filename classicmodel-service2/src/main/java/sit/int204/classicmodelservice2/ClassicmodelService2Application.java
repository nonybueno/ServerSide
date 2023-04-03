package sit.int204.classicmodelservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import sit.int204.classicmodelservice.properties.FileStorageProperties;
import sit.int204.classicmodelservice.properties.JwtProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class, JwtProperties.class
})
public class ClassicmodelService2Application {

    public static void main(String[] args) {
        SpringApplication.run(ClassicmodelService2Application.class, args);
    }

}
