public class WarApp {
    public static void main(String[] args) {
        Armada thisArmada = new Armada();
        Ship thisShip1 = new Ship();
        thisShip1.fillShip();
        Ship thisShip2 = new Ship();
        thisShip2.fillShip();
        thisArmada.addShip(thisShip1);
        thisArmada.addShip(thisShip2);
        Armada otherArmada = new Armada();
        Ship otherShip1 = new Ship();
        otherShip1.fillShip();
        Ship otherShip2 = new Ship();
        otherShip2.fillShip();
        otherArmada.addShip(otherShip1);
        otherArmada.addShip(otherShip2);
        thisArmada.war(otherArmada);

    }
}
