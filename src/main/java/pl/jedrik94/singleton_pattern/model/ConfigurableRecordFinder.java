package pl.jedrik94.singleton_pattern.model;

import java.util.List;

public class ConfigurableRecordFinder {
    private Database database;

    public ConfigurableRecordFinder(Database database) {
        this.database = database;
    }

    public int getTotalPopulation(List<String> cityNames) {
        int result = 0;
        for (String cityName: cityNames) {
            result += database.getPopulation(cityName);
        }
        return result;
    }
}
