package refresher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by SBT-Burtsev-YA on 08.02.2017.
 */

@Service
public class ZuulRefresherInvoker {
    @Autowired
    private ZuulRefresher zuulRefresher;

    @PostConstruct
    private void invokeZuulRefresher() {
        System.out.println("hey");
        zuulRefresher.refresh();
    }
}
