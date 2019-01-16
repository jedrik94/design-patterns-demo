package pl.jedrik94.singleton_pattern;

import pl.jedrik94.singleton_pattern.model.BasicSingleton;

import java.io.*;

public class AppSingleton {
    static void saveToFile(BasicSingleton basicSingleton, String filename) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)) {
            out.writeObject(basicSingleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileInputStream)) {
            return (BasicSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {
        BasicSingleton singleton1 = BasicSingleton.getInstance();
        singleton1.setValue(123);

        String filename = "C:\\temp\\basicSingleton.bin";

        saveToFile(singleton1, filename);

        singleton1.setValue(321);

        BasicSingleton singleton2 = readFromFile(filename);

        System.out.println(singleton1.equals(singleton2));

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
