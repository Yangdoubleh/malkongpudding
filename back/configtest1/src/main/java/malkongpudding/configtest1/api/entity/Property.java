package malkongpudding.configtest1.api.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Property {
    private String uri;
    private String username;
    private String password;
}
