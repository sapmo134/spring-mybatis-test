package my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"my"})
@ImportResource("classpath:applicationContext.xml")
public class MyApp {

    public static void main(String[] args) throws Exception {
//        System.err.println("hoge");
        SpringApplication.run(MyApp.class, args);
    }

}
