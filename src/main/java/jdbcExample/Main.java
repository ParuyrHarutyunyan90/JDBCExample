package jdbcExample;

import jdbcExample.manager.UserManager;
import jdbcExample.model.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        User user = new User("poxos", "poxosyan", "poxos@mail.ru", "poxos1190");
        try {
            userManager.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
