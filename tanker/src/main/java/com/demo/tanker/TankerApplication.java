package com.demo.tanker;

import com.demo.tanker.world.GameBoard;
import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TankerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TankerApplication.class, args);
	}
}
