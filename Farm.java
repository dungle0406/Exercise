import java.util.ArrayList;
import java.util.List;

//# Farm
//
//        - Reuse your `Animal` class
//- Create a `Farm` class
//  - it has a list of Animals
//          - it has a limit that defines how many animals can be kept in the Farm
//          - it has two methods:
//          - `breed()` -> creates a new animal if there's place for it
//          - `sell()` -> removes the least hungry animal
public class Farm {
    private List<Animal> animals;
    private int capacity;

    public Farm(int capacity) {
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public void breed() {
        if (animals.size() < capacity) {
            animals.add(new Animal());
        } else System.out.println("The farm's capacity is full!");
    }

    public void sell() {
        if (!animals.isEmpty()) {
            Animal leastHungryAnimal = animals.get(0);
            for (Animal animal : animals) {
                if (animal.getHunger() < leastHungryAnimal.getHunger()) {
                    leastHungryAnimal = animal;
                }
            }
            animals.remove(leastHungryAnimal);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public static void main(String[] args) {
        Farm farm = new Farm(3);
        farm.breed();
        farm.breed();
        farm.breed();
        System.out.println("Initial Farm: ");
        for (Animal animal : farm.getAnimals()) {
            System.out.println("Hunger: " + animal.getHunger());
        }
        farm.sell();
        System.out.println("After selling: ");
        for (Animal animal : farm.getAnimals()) {
            System.out.println("Hunger: " + animal.getHunger());
        }
    }
}
