package pl.jedrik94.observer_pattern;

import pl.jedrik94.observer_pattern.model.Observer;
import pl.jedrik94.observer_pattern.model.Person;
import pl.jedrik94.observer_pattern.model.PropertyChangedEventArgs;

public class AppObserver implements Observer<Person> {
    public static void main(String[] args) {
        new AppObserver();
    }

    public AppObserver() {
        Person person = new Person();
        person.subscribe(this);
        for (int i = 0; i < 16; i++) {
            person.setAge(i);
        }
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Person's " + args.getPropertyName() +
                " has changed to " + args.getNewValue());
    }
}
