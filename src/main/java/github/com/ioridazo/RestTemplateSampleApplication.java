package github.com.ioridazo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateSampleApplication {

    private final RestTemplate restTemplate;

    public RestTemplateSampleApplication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            // Something
//			RestTemplate restTemplate = new RestTemplate();

            String response = restTemplate.getForObject("http://localhost:8090/", String.class);
            System.out.println(response);
        };
    }
}
