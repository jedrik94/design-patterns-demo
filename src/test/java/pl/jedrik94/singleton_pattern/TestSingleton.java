package pl.jedrik94.singleton_pattern;

import org.junit.jupiter.api.Test;
import pl.jedrik94.singleton_pattern.model.SingletonRecordFinder;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSingleton {
    @Test
    public void singletonTotalPopulationTest() {
        SingletonRecordFinder singletonRecordFinder = new SingletonRecordFinder();

        List<String> cityNames = Arrays.asList("Wroclaw", "Poznan");

        int totalPopulation = singletonRecordFinder.getTotalPopulation(cityNames);

        assertEquals(1001 + 1999, totalPopulation);
    }
}
