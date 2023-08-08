package malkongpudding.configtest1.api.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Property {
    private String key;
    private String value;
}
