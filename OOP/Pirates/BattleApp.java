public class BattleApp {
    public static void main(String[] args) {
        Ship thisShip = new Ship();
        thisShip.fillShip();
        thisShip.displayInformation();
        Ship otherShip = new Ship();
        otherShip.fillShip();
        otherShip.displayInformation();
        thisShip.battle(otherShip);
        thisShip.displayInformation();
        otherShip.displayInformation();
    }
}
