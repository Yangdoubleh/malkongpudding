package mkpd.server2.server1.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Property {
    private String uri;
    private String username;
    private String password;

    private Property(String uri, String username, String password) {
        this.uri = uri;
        this.username = username;
        this.password = password;
    }

    public Property() {
    }

    @Override
    public String toString() {
        return "Property{" +
                "uri='" + uri + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
