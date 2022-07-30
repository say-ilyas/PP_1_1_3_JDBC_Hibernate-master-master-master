package jm.task.core.jdbc;

import jm.task.core.jdbc.service.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static User user1 = new User("Pavel", "Nesterev", (byte) 60);
    private static User user2 = new User("Anna", "Ahmatova", (byte) 15);
    private static User user3 = new User("Egor", "Vlastny", (byte) 126);
    private static User user4 = new User("Miron", "Antonov", (byte) 76);


    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        userService.createUsersTable();
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}