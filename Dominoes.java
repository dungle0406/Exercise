import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);


        List<Domino> result = new ArrayList<>();
        int currentIndex = 0;

        while (!dominoes.isEmpty()) {
            Domino current = dominoes.get(currentIndex);
            int checkedIndex = checkIndex(dominoes, current);

            if (checkedIndex != -1) {
                result.add(current);
                result.add(dominoes.get(checkedIndex));
                dominoes.remove(currentIndex);
                dominoes.remove(checkedIndex);
            } else {
                currentIndex++;
                if (currentIndex >= dominoes.size()) {
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static int checkIndex(List<Domino> dominoes, Domino current) {
        for (int i = 0; i < dominoes.size(); i++) {
            if (current.getRightSide() == dominoes.get(i).getLeftSide()) {
                return i;
            }
        }
        return -1;
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}