package pl.jedrik94.singleton_pattern.model;

import java.util.Dictionary;
import java.util.Hashtable;

public class DummyDatabase implements Database {
    private Dictionary<String, Integer> data = new Hashtable<>();

    public DummyDatabase() {
        data.put("first", 1);
        data.put("second", 2);
        data.put("third", 3);
        data.put("fourth", 4);
    }

    @Override
    public int getPopulation(String cityName) {
        return data.get(cityName);
    }
}
