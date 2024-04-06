package leonardo.ezio.personal.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

/**
 * Hello world!
 */
@SpringBootApplication(scanBasePackages = "leonardo.ezio.personal")
public class TestIntegrationService {

    public static void main(String[] args) {
        SpringApplication.run(TestIntegrationService.class);
    }

}
