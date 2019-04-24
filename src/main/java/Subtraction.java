import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Subtraction {
    private static final int MAX = 11;
    private static Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        subtractFrom();
    }

    private static void subtractFrom() {
        for (int i = 1; i < MAX; i++) {
            System.out.println("Practice subtracting from " + i);
            System.out.println();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j <= i; ) {
                int num = rnd.nextInt(i + 1);
                if (!set.contains(num)) {
                    System.out.println(i + " - " + num + " =  _____");
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
            System.out.println("Subtracting from " + i + " continued");
            System.out.println();
            set.clear();
            for (int j = 0; j <= i; ) {
                int num = rnd.nextInt(i + 1);
                if (!set.contains(num)) {
                    System.out.println(i + " - " + "____ = " + (i - num));
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
        }
    }
}
