package io.ymq.example.config.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}


}
