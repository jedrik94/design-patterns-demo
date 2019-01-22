package pl.jedrik94.proxy_pattern.model;

public class Person implements Human {
    @Override
    public void walk() {
        System.out.println("I can walk.");
    }

    @Override
    public void talk() {
        System.out.println("I can talk.");
    }
}
