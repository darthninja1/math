package worksheets;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class RandomDivision {
    private static final int MAX = 13;
    private static Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        randomProblems();
    }

    private static void randomProblems() {
        LinkedHashSet<Pair<Integer, Integer>> set = new LinkedHashSet<>();
        List<Pair<Integer, Integer>> numbers = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                numbers.add(new Pair<>(i, j));
            }
        }

        boolean newline = false;
        for (int i = 1; i < 100; i++) {
            int idx = rnd.nextInt(numbers.size());
            Pair<Integer, Integer> pair = numbers.get(idx);
            if (!set.contains(pair)) {
                String formatted = String.format("%3d  " + "\u00F7" + " %2d =  _____", pair.getKey() * pair.getValue(), pair.getValue());
                System.out.print(formatted);
                set.add(pair);
                if (newline) {
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.print("    ");
                }
                newline = !newline;
            }
        }
    }
}