package pl.jedrik94.observer_pattern.model;

public class Person {
    public Event<PropertyChangedEventArgs> propertyChanged =
            new Event<>();

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age == age) {
            return;
        } else {
            this.age = age;
            propertyChanged.fire(new PropertyChangedEventArgs(
                    this, "age"
            ));
        }
    }
}
