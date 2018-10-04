package club.hicode.eureka.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/4
 */
public class MicApplicationContext extends ApplicationObjectSupport {

    public void say() {
        ApplicationContext applicationContext = getApplicationContext();
    }
}
