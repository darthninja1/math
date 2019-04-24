package worksheets;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Multiplication {
    private static final int MAX = 13;
    private static Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        multiplyTo();
        multiplyBy();
    }

    private static void multiplyTo() {
        for (int i = 1; i < MAX; i++) {
            System.out.println("Practice multiplying to " + i);
            System.out.println();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j <= i; ) {
                int num = rnd.nextInt(i + 1);
                if (!set.contains(num)) {
                    String formatted = String.format("%2d  " + "\u00D7" + " %2d =  _____", i, num);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
            System.out.println("Multiplying to " + i + " continued");
            System.out.println();
            set.clear();
            for (int j = 0; j <= i; ) {
                int num = rnd.nextInt(i + 1);
                if (!set.contains(num)) {
                    String formatted = String.format("%2d  " + "\u00D7" + " _____ = %2d", i, i * num);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
        }
    }

    private static void multiplyBy() {
        for (int i = 1; i < MAX; i++) {
            System.out.println("Practice multiplying by " + i);
            System.out.println();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < MAX; ) {
                int num = rnd.nextInt(MAX);
                if (!set.contains(num)) {
                    String formatted = String.format("%2d  " + "\u00D7" + " %2d =  _____", num, i);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
            System.out.println("Multiplying by " + i + " continued");
            System.out.println();
            set.clear();
            for (int j = 0; j < MAX; ) {
                int num = rnd.nextInt(MAX);
                if (!set.contains(num)) {
                    String formatted = String.format("____  " + "\u00D7" + " %2d =  %3d", i, i * num);
                    System.out.println(formatted);
                    set.add(num);
                    j++;
                }
            }
            System.out.println();
        }
    }
}
