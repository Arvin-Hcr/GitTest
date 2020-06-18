package org.example.hzerobootgatway;

import org.hzero.autoconfigure.gateway.EnableHZeroGateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableHZeroGateway
@EnableDiscoveryClient
public class HzeroBootGatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroBootGatwayApplication.class, args);
    }

}
