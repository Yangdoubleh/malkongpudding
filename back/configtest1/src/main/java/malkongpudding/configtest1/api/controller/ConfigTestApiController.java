package malkongpudding.configtest1.api.controller;

import malkongpudding.configtest1.api.entity.Property;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Controller
public class ConfigTestApiController implements EnvironmentAware {

    private Environment env;


    @Override
    public void setEnvironment(Environment env) {
        this.env = env;
    }

    @RequestMapping("/config")
    @ResponseStatus(HttpStatus.OK)
    public Mono<ResponseEntity> getConfig() {
        List<Property> propertyList = Arrays.asList(
                Property.builder().key("uri").value(env.getProperty("spring.datasource.uri")).build(),
                Property.builder().key("username").value(env.getProperty("spring.datasource.username")).build(),
                Property.builder().key("password").value(env.getProperty("spring.datasource.password")).build()
        );

        return Mono.just(ResponseEntity.status(HttpStatus.OK)
                                                        .body(propertyList)
        );
    }
}