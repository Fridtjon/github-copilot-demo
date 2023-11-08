package user;

/**
 * user.UserDemo
 *
 * Class to demonstrate the user.User class and user.UserBuilder class.
 */
public class UserDemo {

    public static void main(String[] args) {
        User user = new UserBuilder()
                .setUsername("johndoe")
                .setPassword("password")
                .setEmail("example@example.com")
                .build();

        assert user.getUsername().equals("johndoe");
    }
}
