package user;

/**
 * user.UserBuilder
 * Class to build a user object using the builder pattern
 */
public class UserBuilder {

    User user;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder setUsername(String username) {
        user.setUsername(username);
        return this;
    }

    public UserBuilder setPassword(String password) {
        user.setPassword(password);
        return this;
    }

    public UserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }

    public User build() {
        return user;
    }

}
