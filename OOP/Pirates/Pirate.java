import java.util.Random;

public class Pirate {
    private static Random random = new Random();
    private int intoxicate;
    private boolean isAlive;

    public Pirate() {
        this.intoxicate = 0;
        this.isAlive = true;
    }

    public void drinkSomeRum() {
        if (!this.isAlive) {
            System.out.println("he's dead");
        } else intoxicate++;
    }

    public void howsItGoingMate() {
        if (!this.isAlive) {
            System.out.println("he's dead");
        } else {
            if (intoxicate < 4) {
                System.out.println("Pour me anudder");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                passOut();
            }
        }
    }

    public void brawl(Pirate pirate) {
        if (!(this.isAlive && pirate.isAlive)) {
            System.out.println("he's dead");
        } else {
            int checkingAlive = random.nextInt(3);
            switch (checkingAlive) {
                case 0:
                    this.isAlive = false;
                    pirate.isAlive = true;
                    break;
                case 1:
                    this.isAlive = true;
                    pirate.isAlive = false;
                    break;
                default:
                    this.isAlive = false;
                    pirate.isAlive = false;
                    break;
            }
        }
    }

    public void passOut() {
        this.intoxicate = 0;
    }

    public void die() {
        this.isAlive = false;
    }

    public int getIntoxicate() {
        return intoxicate;
    }

    public void setIntoxicate(int intoxicate) {
        this.intoxicate = intoxicate;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
