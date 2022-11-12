package br.com.ifsp.mensagensaleatorias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MensagensAleatoriasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MensagensAleatoriasApplication.class, args);
    }

    @Bean
    public static RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
