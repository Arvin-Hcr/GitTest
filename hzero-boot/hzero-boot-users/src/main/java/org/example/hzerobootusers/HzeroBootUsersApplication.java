package org.example.hzerobootusers;

import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableChoerodonResourceServer
public class HzeroBootUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzeroBootUsersApplication.class, args);
    }

}
