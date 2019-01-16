package pl.jedrik94.singleton_pattern;

import pl.jedrik94.singleton_pattern.model.Monostate;

public class AppSingleton {

    public static void main(String[] args) {
        Monostate monostate1 = new Monostate();
        monostate1.setName("monostate");
        monostate1.setDescription("outdated");

        System.out.println(monostate1);

        Monostate monostate2 = new Monostate();
        System.out.println(monostate2);
    }
}
