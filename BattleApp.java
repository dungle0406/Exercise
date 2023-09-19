public class BattleApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        ship1.fillShip();
        System.out.println("This ship: ");
        ship1.display();
        Ship ship2 = new Ship();
        ship2.fillShip();
        System.out.println("\nOther ship: ");
        ship2.display();
        ship1.battle(ship2);
    }
}
