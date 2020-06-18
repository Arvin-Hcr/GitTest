package org.example.hzerobootconfig;

import org.hzero.autoconfigure.config.EnableHZeroConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.config.ConfigServerAutoConfiguration;

@EnableHZeroConfig
@EnableDiscoveryClient
@SpringBootApplication(exclude = ConfigServerAutoConfiguration.class)
public class HzeroBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroBootConfigApplication.class, args);
    }

}
