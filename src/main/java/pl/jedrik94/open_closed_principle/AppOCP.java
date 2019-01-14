package pl.jedrik94.open_closed_principle;

import pl.jedrik94.open_closed_principle.model.*;

import java.util.Arrays;
import java.util.List;

public class AppOCP {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product toiletPaper = new Product("Toilet Paper", Color.BLUE, Size.MEDIUM);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple, toiletPaper, tree, house);

        ProductFilter productFilter = new ProductFilter();

        System.out.println("Blue products:");
        productFilter.filter(products, new ColorSpecification(Color.BLUE))
                .forEach(product -> System.out.println(" - " + product.getName()));

        System.out.println("Large products:");
        productFilter.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(product -> System.out.println(" - " + product.getName()));

        System.out.println("Small & red products:");
        productFilter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.RED),
                new SizeSpecification(Size.SMALL)
        )).forEach(product -> System.out.println(" - " + product.getName()));
    }
}
