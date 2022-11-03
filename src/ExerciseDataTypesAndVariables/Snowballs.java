package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double snowballValue = Double.MIN_VALUE;
        int snowballSnow1 = 0;
        int snowballTime1 = 0;
        int snowballQuality1 = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double local =  Math.pow((snowballSnow*1.0 / snowballTime), snowballQuality);

            if (local >= snowballValue) {
                snowballValue = local;
                snowballSnow1 = snowballSnow;
                snowballTime1 = snowballTime;
                snowballQuality1 = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnow1, snowballTime1, snowballValue, snowballQuality1);
    }
}
