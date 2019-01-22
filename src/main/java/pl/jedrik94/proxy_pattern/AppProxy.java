package pl.jedrik94.proxy_pattern;

import pl.jedrik94.proxy_pattern.model.Human;
import pl.jedrik94.proxy_pattern.model.LoggingHandler;
import pl.jedrik94.proxy_pattern.model.Person;

import java.lang.reflect.Proxy;

public class AppProxy {
    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> interface_) {
        return (T) Proxy.newProxyInstance(
                interface_.getClassLoader(),
                new Class<?>[] {interface_},
                new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {
        Person person = new Person();
        Human logged = withLogging(person, Human.class);

        logged.talk();
        logged.talk();
        logged.talk();

        logged.walk();
        logged.walk();

        System.out.println(logged.toString());
    }
}