package pl.jedrik94.singleton_pattern;

import pl.jedrik94.singleton_pattern.model.BasicSingleton;
import pl.jedrik94.singleton_pattern.model.StaticBlockSingleton;

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
        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
    }
}
