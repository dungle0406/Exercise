import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    private static Random random = new Random();
    private List<Pirate> crew;
    private Pirate captain;

    public Ship() {
        this.crew = new ArrayList<>();
        this.captain = null;
    }

    public void fillShip() {
        int crewMember = random.nextInt(114);
        for (int i = 0; i < crewMember; i++) {
            crew.add(new Pirate());
        }
        this.captain = new Pirate();
    }

    public void displayInformation() {
        System.out.println("Rum consumed by the captain: " + captain.getIntoxicate());
        System.out.println("Is the captain alive? " + (captain.isAlive() ? "Yes" : "No"));
        System.out.println("Number of alive pirates in the crew: " + aliveCrewMember(crew));
    }
    public int aliveCrewMember(List<Pirate> crew) {
        int aliveCrewMember = 0;
        for (Pirate crewM : crew) {
            if (crewM.isAlive()) {
                aliveCrewMember++;
            }
        }
        return aliveCrewMember;
    }

    public boolean battle(Ship otherShip) {
        int calculatedScore = calculateScore(otherShip);
        if (calculatedScore > 0) {
            victory();
            otherShip.defeat();
            System.out.println("This ship wins");
            return true;
        } else {
            defeat();
            otherShip.victory();
            System.out.println("Other ship wins");
            return false;
        }
    }

    public int calculateScore(Ship otherShip) {
        int thisScore = aliveCrewMember(crew) + captain.getIntoxicate();
        int otherScore = aliveCrewMember(otherShip.crew) + otherShip.captain.getIntoxicate();
        return thisScore - otherScore;
    }

    public void victory() {
        int randomRum = random.nextInt(4);
        if (captain.isAlive()) {
            for (int i = 0; i < randomRum; i++) {
                if (captain.getIntoxicate() < 4) {
                    captain.drinkSomeRum();
                } else {
                    captain.passOut();
                    break;
                }
            }
        }
        for (Pirate crewM : crew) {
            if (crewM.isAlive()) {
                for (int i = 0; i < random.nextInt(4); i++) {
                    if (crewM.getIntoxicate() < 4) {
                        crewM.drinkSomeRum();
                    } else {
                        crewM.passOut();
                        break;
                    }
                }
            }
        }
    }

    public void defeat() {
        int randomDeath = random.nextInt(crew.size()) + 1;
        for(int i = 0; i < randomDeath; i++) {
            int randomDeathPirate = random.nextInt(crew.size());
            crew.get(randomDeathPirate).die();
        }
    }
}
