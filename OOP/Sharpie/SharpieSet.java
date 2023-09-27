import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SharpieSet {
    private List<Sharpie> sharpies;

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : sharpies) {
            if (sharpie.getInkAmount() > 0) {
                count++;
            }
        }
        return count;
    }

    public void removeTrash() {
//        for (Sharpie sharpie : sharpies) {
//            if (sharpie.getInkAmount() <= 0) {
//                sharpies.remove(sharpie);
//            }
//        }
        Iterator<Sharpie> iterator = sharpies.iterator();
        while (iterator.hasNext()) {
            Sharpie sharpie = iterator.next();
            if(sharpie.getInkAmount() <= 0) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Sharpie red = new Sharpie("Red", 10);
        Sharpie blue = new Sharpie("Blue", 20);
        Sharpie green = new Sharpie("Green", 30);
        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.add(red);
        sharpieSet.add(blue);
        sharpieSet.add(green);
        System.out.println("Size of Sharpies: " + sharpieSet.sharpies.size());
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        sharpieSet.sharpies.get(0).use();
        System.out.println("the number of usable Sharpies: " + sharpieSet.countUsable());

        sharpieSet.removeTrash();
        System.out.println("Size of Sharpies: " + sharpieSet.sharpies.size());
    }
}
