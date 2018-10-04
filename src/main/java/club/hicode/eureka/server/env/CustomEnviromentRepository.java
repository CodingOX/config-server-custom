package club.hicode.eureka.server.env;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * XXXX
 *
 * @author LiuChunfu
 * @date 2018/10/4
 */
@Component
@Profile("custom")
public class CustomEnviromentRepository implements EnvironmentRepository {

    public CustomEnviromentRepository(){
        System.out.println("init......................................");
    }

    @Override
    public Environment findOne(String application, String profile, String label) {
        Environment environment = new Environment("custom", "dev");
        Map<String, String> map = new HashMap<>();
        map.put("user.name", System.currentTimeMillis() + "");
        map.put("user.id", "123");

        PropertySource propertySource = new PropertySource("cus-property", map);
        environment.addFirst(propertySource);
        return environment;
    }
}
