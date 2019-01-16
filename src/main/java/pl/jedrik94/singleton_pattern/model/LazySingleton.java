package pl.jedrik94.singleton_pattern.model;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
