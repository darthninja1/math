package worksheets;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Division {
    private static final int MAX = 13;
    private static Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        dividingBy();
    }

    private static void dividingBy() {
        for (int i = 1; i < MAX; i++) {
            System.out.println("Practice dividing by " + i);
            System.out.println();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < MAX; ) {
                int num = rnd.nextInt(MAX);
                if (!set.contains(num)) {
                    String formatted = String.format("%3d " + "\u00F7" + " %2d = _____", num * i, i);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
            System.out.println("Dividing by " + i + " continued");
            System.out.println();
            set.clear();
            for (int j = 0; j < MAX; ) {
                int num = rnd.nextInt(MAX);
                if (!set.contains(num)) {
                    String formatted = String.format("____ " + "\u00F7" + " %2d = %2d", i, num);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
        }
    }
}
