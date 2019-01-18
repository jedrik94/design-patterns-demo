package pl.jedrik94.composite_pattern.model;

public interface SomeNeurons extends Iterable<Neuron> {
    default void connectTo(SomeNeurons others) {
        if (this == others) return;

        for (Neuron from : this) {
            for (Neuron to : others) {
                from.out.add(to);
                to.in.add(from);
            }
        }
    }
}
