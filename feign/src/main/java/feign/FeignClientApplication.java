package feign;

/**
 * Created by SBT-Burtsev-YA on 08.02.2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Controller
public class FeignClientApplication {
    @Autowired
    private static GatewayRefresher refresher;

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
        refresher.refresh();
    }


}