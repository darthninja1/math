package learn;

public class LearnDivision {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Division Table for " + i);
            for (int j = 0; j <= 12; j++) {
                String formatted = String.format("%3d " + "\u00F7" + " %2d  =  %2d", i * j , i, j);
                System.out.println(formatted);
            }
            System.out.println();
        }
    }
}