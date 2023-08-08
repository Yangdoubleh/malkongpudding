package malkongpudding.configtest1.api;

import com.fasterxml.jackson.core.JsonToken;
import malkongpudding.configtest1.api.controller.ConfigTestApiController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

@WebFluxTest(controllers = ConfigTestApiController.class)
class ConfigTestApiControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    @DisplayName("getConfig 메서드 테스트")
    void getConfig() {
        this.webTestClient.get().uri("/config").exchange()
                .expectStatus().isOk()
                .expectBody(List.class).value(System.out::println);
    }
}