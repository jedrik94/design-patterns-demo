package pl.jedrik94.singleton_pattern.model;

public class Monostate {
    private static String name;
    private static String description;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Monostate.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Monostate.description = description;
    }

    @Override
    public String toString() {
        return "Monostate{" +
                "name='" + Monostate.name + '\'' +
                ", description='" + Monostate.description + '\'' +
                '}';
    }
}
