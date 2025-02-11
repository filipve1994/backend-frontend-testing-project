package be.fve.programmingprojects.backendfrontendtestingoidcauthserver;

import org.springframework.boot.SpringApplication;

public class TestBackendFrontendTestingOidcAuthserverApplication {

    public static void main(String[] args) {
        SpringApplication.from(BackendFrontendTestingOidcAuthserverApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
