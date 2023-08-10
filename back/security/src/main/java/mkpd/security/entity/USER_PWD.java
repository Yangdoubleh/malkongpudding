package mkpd.security.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "USER_PWD")
public class USER_PWD {
    @Id
    @Column(name = "USERID", nullable = false)
    private UUID USERID;

    @Column(name="PWD", nullable = false)
    private String PWD;

    @Column(name="LDATE", nullable = false)
    private LocalDateTime LDATE;

    @Builder
    public USER_PWD(UUID USERID, String PWD, LocalDateTime LDATE) {
        this.USERID = USERID;
        this.PWD = PWD;
        this.LDATE = LDATE;
    }
}
