package iyteyazilim.projects.haydos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "iyteyazilim.projects.haydos.entity")
@SpringBootApplication

public class HaydosApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaydosApplication.class, args);
	}

}
