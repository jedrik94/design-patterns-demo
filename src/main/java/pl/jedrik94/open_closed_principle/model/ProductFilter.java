package pl.jedrik94.open_closed_principle.model;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {
        return items.stream().filter(specification::isSatisfied);
    }
}
