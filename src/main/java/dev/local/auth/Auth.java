package dev.local.auth;

import dev.local.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Auth {
    private String token;
    private User user;

    public Auth(String token, User user) {
        this.token = token;
        this.user = user;
    }
}
