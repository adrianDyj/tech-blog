package pl.dyjecinski.techblog.domain.user;

import java.time.LocalDateTime;

class User {
    private UserId id;
    private String email;
    private String username;
    private String password;
    private LocalDateTime createdAt;
}
