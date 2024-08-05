package technical.test.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "technical.test.api.storage.repositories")
public class TechnicalTestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnicalTestApiApplication.class, args);
    }

}
