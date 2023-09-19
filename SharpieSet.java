import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    private List<Sharpie> sharpies;

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    void add(Sharpie sharpie) {
        this.sharpies.add(sharpie);
    }

    public boolean isUsable(Sharpie sharpie) {
        return sharpie.getInkAmount() > 0;
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : sharpies) {
            if (isUsable(sharpie)) {
                count++;
            }
        }
        return count;
    }

    void removeTrash() {
        for (Sharpie sharpie : sharpies) {
            if (!isUsable(sharpie)) {
                sharpies.remove(sharpie);
            }
        }
    }


    //    public static void main(String[] args) {
//            List<Sharpie> sharpies = new ArrayList<>();
//            sharpies.add(new Sharpie("Black", 1.0f);
//            sharpies.add(new Sharpie("Blue", 2.0f);
//            sharpies.add(new Sharpie("Green", 3.0f);
//            sharpies.add(new Sharpie("Yellow", 4.0f);
//            sharpies.add(new Sharpie("Red", 5.0f);
    public static void main(String[] args) {
        SharpieSet sharpieSet = new SharpieSet();

        Sharpie blueSharpie = new Sharpie("Blue", 1.0f);
        Sharpie redSharpie = new Sharpie("Red", 0.8f);

        sharpieSet.add(blueSharpie);
        sharpieSet.add(redSharpie);

        blueSharpie.use();
        blueSharpie.use();
        blueSharpie.use();
        blueSharpie.use();
        blueSharpie.use();
        blueSharpie.use();
        blueSharpie.use();
        blueSharpie.use();
        blueSharpie.use();
        blueSharpie.use();



        System.out.println("Usable Sharpies: " + sharpieSet.countUsable());

        sharpieSet.removeTrash();

        System.out.println("Usable Sharpies after removing trash: " + sharpieSet.countUsable());
    }
}
