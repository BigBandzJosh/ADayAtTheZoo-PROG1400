public class Animal {
    private String species;
    private double MaxWeight;
    private String habitat;
    boolean isEndangered;
    public Animal() {
        this.species = "Dog";
        this.MaxWeight = 60;
        this.habitat = "Under my feet";
        this.isEndangered = false;
    }
    public Animal (String species, double MaxWeight, String habitat, boolean isEndangered) {
        this.species = species;
        this.MaxWeight = MaxWeight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }
    public String fedAnimal(String meal) {
        return "The " + species + " ate " + meal;
    }
    public String animalSounds(String sound) {
        return "The " + species + " makes the sound " + sound;
    }
    public String toString() {
        if (!isEndangered) {
            return "The " + species + " is a " + habitat + " animal that weighs " + MaxWeight + " pounds.";
        }
        else {
            return "The " + species + " is a " + habitat + " animal that weighs " + MaxWeight + " pounds. I am endangered, SAVE ME:(.";
        }
    }
}
