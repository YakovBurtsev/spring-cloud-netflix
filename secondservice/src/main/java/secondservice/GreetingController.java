package secondservice;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SBT-Burtsev-YA on 06.02.2017.
 */

public interface GreetingController {
    @RequestMapping("/greeting")
    String greeting();
}
