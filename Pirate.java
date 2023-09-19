import java.util.Random;

public class Pirate {
    private static Random random = new Random();
    private int intoxicate;
    private boolean isAlive;


    public Pirate() {
        this.intoxicate = 0;
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getIntoxicate() {
        return intoxicate;
    }

    void drinkSomeRum() {
        if (!this.isAlive) {
            System.out.println("he's dead");
            return;
        }
        this.intoxicate++;
    }

    void howsItGoingMate() {
        if (!this.isAlive) {
            System.out.println("he's dead");
            return;
        } else if (this.intoxicate < 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.intoxicate = 0;
        }
    }

    void brawl(Pirate pirate) {
        if (!(this.isAlive && pirate.isAlive)) {
            System.out.println("he's dead");
        } else {
            int amountALive = random.nextInt(3);
            switch (amountALive) {
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
}
