package pl.jedrik94.composite_pattern;

import pl.jedrik94.composite_pattern.model.Neuron;
import pl.jedrik94.composite_pattern.model.NeuronLayer;

public class AppComposite {
    public static void main(String[] args) {
        Neuron neuron1 = new Neuron();
        Neuron neuron2 = new Neuron();
        NeuronLayer neuronLayer1 = new NeuronLayer();
        NeuronLayer neuronLayer2 = new NeuronLayer();

        neuron1.connectTo(neuron2);
        neuron1.connectTo(neuronLayer1);
        neuronLayer1.connectTo(neuron2);
        neuronLayer2.connectTo(neuronLayer1);
    }
}
