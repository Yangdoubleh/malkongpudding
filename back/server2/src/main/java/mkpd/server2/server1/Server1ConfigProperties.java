package mkpd.server2.server1;

import mkpd.server2.server1.dto.Property;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SERVER1")
public interface Server1ConfigProperties {

    @GetMapping("/config")
    Property configProperty();
}
