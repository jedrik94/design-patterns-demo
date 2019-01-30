package pl.jedrik94.chain_of_responsibility_pattern.model;

public class CreatureModifier {
    protected Creature creature;
    protected CreatureModifier nextModifier;

    public CreatureModifier(Creature creature) {
        this.creature = creature;
    }

    public void addModifier(CreatureModifier modifier) {
        if (nextModifier != null) {
            nextModifier.addModifier(modifier);
        } else {
            nextModifier = modifier;
        }
    }

    public void handleModifier() {
        if (nextModifier != null) {
            nextModifier.handleModifier();
        }

        nextModifier = null;
    }
}
