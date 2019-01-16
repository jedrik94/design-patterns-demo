package pl.jedrik94.singleton_pattern;

import pl.jedrik94.singleton_pattern.model.EnumBasedSingleton;

import java.io.*;

public class AppSingleton {
    static void saveToFile(EnumBasedSingleton enumBasedSingleton, String filename) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
            out.writeObject(enumBasedSingleton);
        }
    }

    static EnumBasedSingleton readFromFile(String filename) throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileInputStream)) {
            return (EnumBasedSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        String filename = "C:\\temp\\enumBasedSingleton.bin";

        EnumBasedSingleton singleton1 = EnumBasedSingleton.INSTANCE;
        singleton1.setValue(123);
        saveToFile(singleton1, filename);

        EnumBasedSingleton singleton2 = readFromFile(filename);
        System.out.println(singleton2.getValue());
    }
}
