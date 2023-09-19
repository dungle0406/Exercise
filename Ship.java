import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private Random random = new Random();
    private List<Pirate> crew;
    private Pirate captain;

    public Ship() {
        this.crew = new ArrayList<>();
        this.captain = null;
    }

    void fillShip() {
        captain = new Pirate();
        this.crew = new ArrayList<>();
        int crewSize = random.nextInt(114);
        for (int i = 0; i < crewSize; i++) {
            crew.add(new Pirate());
        }
    }

    public void display() {
        System.out.println("Captain's intoxication level: " + captain.getIntoxicate());
        System.out.println("Captain state: " + (captain.isAlive() ? "Alive" : "Dead"));
        System.out.println("Number of alive pirates in the crew: " + crew.size());
    }

    boolean battle(Ship otherShip) {
        int score = this.crew.size() - otherShip.crew.size();
        if (score > 0) {
            System.out.println("This ship wins");
            victory();
            return true;
        } else if (score == 0) {
            System.out.println("No ship wins");
            return false;
        } else {
            System.out.println("This ship looses");
            defeat();
            return false;
        }
    }

    private void defeat() {
        int death = random.nextInt(crew.size() + 1);
        crew.remove(death);
        System.out.println("Number of alive pirates after defeat: " + crew.size());
    }

    private void victory() {
        for (int i = 0; i < random.nextInt(crew.size() + 1); i++) {
            captain.drinkSomeRum();
        }
        for (Pirate pirate : crew) {
            for (int i = 0; i < random.nextInt(crew.size() + 1); i++) {
                pirate.drinkSomeRum();
            }
        }
    }
}
