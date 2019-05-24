package ru.vertobrat.cashbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CashboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashboxApplication.class, args);
    }

}
