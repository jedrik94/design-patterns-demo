package pl.jedrik94.observer_pattern.model;

public interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
