package malkongpudding.configtest1.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigTestApiController {

    @Value("${spring.datasource.uri}")
    private String uri;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @RequestMapping("/config")
    public Mono<ResponseEntity> getConfig() {
        Map<String, String> configMap = new HashMap<>();
        configMap.put("uri", uri);
        configMap.put("username", username);
        configMap.put("password", password);
        return Mono.just(ResponseEntity.ok(configMap));
    }
}