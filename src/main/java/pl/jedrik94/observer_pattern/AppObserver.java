package pl.jedrik94.observer_pattern;

import pl.jedrik94.observer_pattern.model.Event;
import pl.jedrik94.observer_pattern.model.Person;

public class AppObserver {
    public static void main(String[] args) {
        Person person = new Person();
        Event<pl.jedrik94.observer_pattern.model.PropertyChangedEventArgs>.Subscription subscription = person.propertyChanged.addHandler(e -> {
            System.out.println("Person's " + e.getPropertyName() +
                    " has changed.");
        });
        person.setAge(1);
        person.setAge(11);
        subscription.close();
        person.setAge(12);
    }
}
