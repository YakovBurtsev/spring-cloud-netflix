package secondservice;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;
import refresher.ZuulRefresher;

/**
 * Created by SBT-Burtsev-YA on 06.02.2017.
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SecondServiceApplication implements GreetingController {
    @Autowired
    private static ZuulRefresher zuulRefresher;

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    public static void main(String[] args) {
        SpringApplication.run(SecondServiceApplication.class, args);
        // should send post request to zuul /routes in order force a refresh of the existing routes
        zuulRefresher.refresh();
    }

    @Override
    public String greeting() {
        return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }
}