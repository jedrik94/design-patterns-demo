package pl.jedrik94.singleton_pattern.model;

import java.util.List;

public class SingletonRecordFinder {
    public int getTotalPopulation(List<String> cityNames) {
        int result = 0;
        for (String cityName: cityNames) {
            result += SingletonDatabase.getInstance().getPopulation(cityName);
        }
        return result;
    }
}
