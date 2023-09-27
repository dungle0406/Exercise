import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animals;
    private int capacity;

    public Farm(int capacity) {
        this.capacity = capacity;
        animals = new ArrayList<>();
    }

    public void breed() {
        if (animals.size() < capacity) {
            Animal newAnimal = new Animal();
            animals.add(newAnimal);
            System.out.println("Added!");
        } else System.out.println("Cannot add because of full of space!");
    }

    public void sell() {
        if (!animals.isEmpty()) {
            int leastHungry = animals.get(0).getHunger();
            int index = 0;
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getHunger() < leastHungry) {
                    leastHungry = animals.get(i).getHunger();
                    index = i;
                }
            }
            animals.remove(index);
            System.out.println("Sold!");
        } else {
            System.out.println("No animals to sell!");
        }
    }

    public static void main(String[] args) {
        Farm farm = new Farm(4);

        Animal dog = new Animal();
        dog.eat();
        Animal cat = new Animal();
        cat.drink();
        Animal fish = new Animal();
        fish.play();

        farm.animals.add(dog);
        farm.animals.add(cat);
        farm.animals.add(fish);
        System.out.println(farm.animals.size());
        farm.breed();
        farm.breed();
        System.out.println(farm.animals.size());
        farm.sell();
        System.out.println(farm.animals.size());
    }
}
