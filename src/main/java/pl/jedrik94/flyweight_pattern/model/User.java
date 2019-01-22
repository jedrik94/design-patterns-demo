package pl.jedrik94.flyweight_pattern.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class User {
    private static List<String> strings = new ArrayList<>();
    private int[] names;

    public User(String fullName) {
        Function<String, Integer> getOrAdd =  (String s) -> {
            int index = strings.indexOf(s);

            if (index != -1) {
                return index;
            } else {
                strings.add(s);
                return strings.size() - 1;
            }
        };

        names = Arrays.stream(fullName.split(" "))
                .mapToInt(getOrAdd::apply)
                .toArray();
    }

    public String getFullName() {
        return Arrays.stream(names)
                .mapToObj(strings::get)
                .collect(Collectors.joining(", "));
    }
}
