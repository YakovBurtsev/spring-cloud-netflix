package feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SBT-Burtsev-YA on 08.02.2017.
 */

@FeignClient("gateway")
public interface GatewayRefresher {
    @RequestMapping(value = "/routes", method = RequestMethod.POST)
    void refresh();
}
