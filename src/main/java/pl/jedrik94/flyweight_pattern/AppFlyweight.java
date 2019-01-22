package pl.jedrik94.flyweight_pattern;

import pl.jedrik94.flyweight_pattern.model.User;

public class AppFlyweight {
    public static void main(String[] args) {
        User user1 = new User("Jedrzej Wojtkowiak");
        User user2 = new User("Andrzej Wojtkowiak");
        User user3 = new User("Jedrzej Stachowski");

        System.out.println(user1.getFullName() + "; " + user2.getFullName() + "; " + user3.getFullName());
    }
}
