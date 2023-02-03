public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Elephant", 1000, "desert", false);
        Animal animal2 = new Animal("Lion", 500, "desert", true);
        Animal animal3 = new Animal("Tiger", 800, "desert", true);
        Animal animal4 = new Animal();
        Animal[] animals = {animal1, animal2, animal3,animal4};
        for (int i =0; i < animals.length; i++) {
            System.out.println(animals[i].fedAnimal("grass"));
            System.out.println(animals[i].animalSounds("roar"));
            System.out.println(animals[i]);
        }
    }
}