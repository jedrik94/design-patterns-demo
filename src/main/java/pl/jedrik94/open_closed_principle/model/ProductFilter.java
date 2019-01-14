package pl.jedrik94.open_closed_principle.model;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(product -> product.getColor() == color && product.getSize() == size);
    }
}
