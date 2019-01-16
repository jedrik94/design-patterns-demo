package pl.jedrik94.singleton_pattern.model;

public class InnerStaticSingleton {
    private InnerStaticSingleton() {
    }
    
    private static class InnerStaticSingletonImpl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return InnerStaticSingletonImpl.INSTANCE;
    }
}
