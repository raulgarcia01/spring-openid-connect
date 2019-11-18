package sv.rgarcia.openid.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(WsApplication.class);

    public static void main(String[] args) {
        LOGGER.info("WS Application");
        SpringApplication.run(WsApplication.class, args);
    }
}
