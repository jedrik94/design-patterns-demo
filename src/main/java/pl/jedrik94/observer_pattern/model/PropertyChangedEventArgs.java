package pl.jedrik94.observer_pattern.model;

public class PropertyChangedEventArgs {
    private Object source;
    private String propertyName;

    public PropertyChangedEventArgs(Object source, String propertyName) {
        this.source = source;
        this.propertyName = propertyName;
    }

    public Object getSource() {
        return source;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
