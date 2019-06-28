package kr.co.tiggle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class TiggleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TiggleApplication.class);
        app.addListeners(new ApplicationPidFileWriter());
        app.run(args);
    }

}
