package pl.jedrik94.proxy_patterm.model;

public class Creature {
    private Property<Integer> agility;

    public Creature(int agilityValue) {
        this.agility = new Property<Integer>(agilityValue);
    }

    public int getAgility() {
        return agility.getValue();
    }

    public void setAgility(int agilityValue) {
        this.agility.setValue(agilityValue);
    }
}
