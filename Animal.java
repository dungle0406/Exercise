//Create an Animal class
//Every animal has a hunger value, which is a whole number
//                Every animal has a thirst value, which is a whole number
//                When creating a new animal instance these values must be set to the default 50 value
//        Every animal can eat() which decreases its hunger by one
//        Every animal can drink() which decreases its thirst by one
//        Every animal can play() which increases both its hunger and thirst by one
public class Animal {
    private int hunger;
    private int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }
    public void eat() {
        this.hunger--;
    }
    public void drink() {
        this.thirst--;
    }
    public void play() {
        this.hunger++;
        this.thirst++;
    }

    public int getHunger() {
        return hunger;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Hunger: " + animal.hunger);
        System.out.println("Thirst: " + animal.thirst);
        animal.eat();
        System.out.println("Hunger: " + animal.hunger);
        animal.drink();
        System.out.println("Thirst: " + animal.thirst);
        animal.play();
        System.out.println("Hunger: " + animal.hunger);
        System.out.println("Thirst: " + animal.thirst);
    }
}
