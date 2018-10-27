package my;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/rs")
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        packages("my.controller");
    }
}
