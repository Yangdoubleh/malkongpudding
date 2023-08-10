package malkongpudding.configtest1.api.controller;

import malkongpudding.configtest1.api.entity.Property;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigTestApiController implements EnvironmentAware {

    private Environment env;


    @Override
    public void setEnvironment(Environment env) {
        this.env = env;
    }

    @RequestMapping("/config")
    public Property getConfig() {
        Property configProperty = Property.builder()
                .uri(env.getProperty("spring.datasource.uri"))
                .username(env.getProperty("spring.datasource.username"))
                .password(env.getProperty("spring.datasource.password"))
                .build();

        return configProperty;
    }
}