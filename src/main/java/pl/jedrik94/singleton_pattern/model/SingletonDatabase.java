package pl.jedrik94.singleton_pattern.model;

import com.google.common.collect.Iterables;

import javax.xml.crypto.Data;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class SingletonDatabase implements Database {
    public static int instanceCount = 0;
    private static Dictionary<String, Integer> cities = new Hashtable<>();

    private SingletonDatabase() {
        instanceCount++;

        try {
            File file = new File(SingletonDatabase.class.getProtectionDomain()
                    .getCodeSource().getLocation().getPath());
            Path fullPath = Paths.get(file.getPath(), "cities.txt");
            List<String> lines = Files.readAllLines(fullPath);

            Iterables.partition(lines, 2)
                    .forEach(kv -> cities.put(
                            kv.get(0).trim(),
                            Integer.parseInt(kv.get(1))
                    ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final SingletonDatabase INSTANCE = new SingletonDatabase();

    public static SingletonDatabase getInstance() {
        return INSTANCE;
    }

    public int getPopulation(String name) {
        return cities.get(name);
    }
}
