package learn;

public class LearnAddition {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Addition Table for " + i);
            for (int j = 0; j <= 9; j++) {
                String formatted = String.format("%d  + %d  =  %2d", i, j, i + j);
                System.out.println(formatted);
            }
            System.out.println();
        }
    }
}