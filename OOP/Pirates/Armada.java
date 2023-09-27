import java.util.ArrayList;
import java.util.List;

public class Armada {
    private List<Ship> ships;

    public Armada() {
        this.ships = new ArrayList<>();
    }

    public boolean war(Armada otherArmada) {
        int thisShip = 0;
        int otherShip = 0;
        while (thisShip < ships.size() && otherShip < otherArmada.ships.size()) {
            if (ships.get(thisShip).battle(otherArmada.ships.get(otherShip))) {
                otherShip++;
            } else {
                thisShip++;
            }
        }
        if (otherShip == otherArmada.ships.size()) {
            System.out.println("This armada wins!");
            return true;
        } else {
            System.out.println("Other armada wins!");
            return false;
        }
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }
}
