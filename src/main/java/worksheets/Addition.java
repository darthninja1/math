package worksheets;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Addition {
    private static final int MAX = 11;
    private static Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        addingTo();
        addingBy();
    }

    private static void addingTo() {
        for (int i = 1; i < MAX; i++) {
            System.out.println("Practice adding to " + i);
            System.out.println();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j <= i; ) {
                int num = rnd.nextInt(i + 1);
                if (!set.contains(num)) {
                    String formatted = String.format("%2d + %2d =  _____", i, num);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
            System.out.println("Adding to " + i + " continued");
            System.out.println();
            set.clear();
            for (int j = 0; j <= i; ) {
                int num = rnd.nextInt(i + 1);
                if (!set.contains(num)) {
                    String formatted = String.format("%2d + _____ = %2d", i, i + num);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
        }
    }

    private static void addingBy() {
        for (int i = 1; i < MAX; i++) {
            System.out.println("Practice adding by " + i);
            System.out.println();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < MAX; ) {
                int num = rnd.nextInt(MAX);
                if (!set.contains(num)) {
                    String formatted = String.format("%2d + %2d =  _____", num, i);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
            System.out.println("Adding by " + i + " continued");
            System.out.println();
            set.clear();
            for (int j = 0; j < MAX; ) {
                int num = rnd.nextInt(MAX);
                if (!set.contains(num)) {
                    String formatted = String.format("____ + %2d =  %2d", i, i + num);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
        }
    }
}