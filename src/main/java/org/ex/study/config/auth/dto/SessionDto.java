package org.ex.study.config.auth.dto;

import lombok.Getter;
import org.ex.study.domain.user.User;

import java.io.Serializable;

@Getter
public class SessionDto implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionDto(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }

}
