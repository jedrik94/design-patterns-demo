package pl.jedrik94.open_closed_principle.model;

public class AndSpecification<T> implements Specification<T> {
    private Specification<T> firstSpecification, secondSpecification;

    public AndSpecification(Specification<T> firstSpecification, Specification<T> secondSpecification) {
        this.firstSpecification = firstSpecification;
        this.secondSpecification = secondSpecification;
    }

    @Override
    public boolean isSatisfied(T item) {
        return firstSpecification.isSatisfied(item) && secondSpecification.isSatisfied(item);
    }
}
