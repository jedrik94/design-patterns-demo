package pl.jedrik94.open_closed_principle.model;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
