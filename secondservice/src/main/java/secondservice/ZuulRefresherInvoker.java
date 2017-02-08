package secondservice;

import org.springframework.beans.factory.annotation.Autowired;
import refresher.ZuulRefresher;

import javax.annotation.PostConstruct;

/**
 * Created by SBT-Burtsev-YA on 08.02.2017.
 */
public class ZuulRefresherInvoker {
    @Autowired
    private ZuulRefresher zuulRefresher;

    @PostConstruct
    private void invokeZuulRefresher() {
        zuulRefresher.refresh();
    }
}
