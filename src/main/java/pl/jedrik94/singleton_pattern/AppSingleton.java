package pl.jedrik94.singleton_pattern;

import pl.jedrik94.singleton_pattern.model.BasicSingleton;

public class AppSingleton {
    public static void main(String[] args) {
        BasicSingleton basicSingleton1 = BasicSingleton.getInstance();
        BasicSingleton basicSingleton2 = BasicSingleton.getInstance();

        basicSingleton1.setValue(123);

        System.out.println(basicSingleton1.getValue());
        System.out.println(basicSingleton2.getValue());

        basicSingleton2.setValue(321);

        System.out.println(basicSingleton1.getValue());
        System.out.println(basicSingleton2.getValue());
    }
}
