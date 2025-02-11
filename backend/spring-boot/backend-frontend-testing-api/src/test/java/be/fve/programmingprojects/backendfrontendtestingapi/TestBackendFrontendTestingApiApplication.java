package be.fve.programmingprojects.backendfrontendtestingapi;

import org.springframework.boot.SpringApplication;

public class TestBackendFrontendTestingApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BackendFrontendTestingApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
