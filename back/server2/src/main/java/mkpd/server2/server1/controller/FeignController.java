package mkpd.server2.server1.controller;

import lombok.RequiredArgsConstructor;
import mkpd.server2.server1.Server1ConfigProperties;
import mkpd.server2.server1.dto.Property;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class FeignController {

    private final Server1ConfigProperties server1ConfigProperties;

    @GetMapping("/call/server1/config")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Property> getServer1Config() {
        return Mono.fromSupplier(() -> server1ConfigProperties.configProperty());
    }
}
