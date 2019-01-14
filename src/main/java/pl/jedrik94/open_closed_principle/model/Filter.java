package pl.jedrik94.open_closed_principle.model;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> specification);
}
