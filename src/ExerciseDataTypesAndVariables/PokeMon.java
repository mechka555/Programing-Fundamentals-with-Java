package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int local = n;

        while (local >= m) {
            count++;
            local -= m;
            if (local == n/2) {
                if (y != 0) {
                    local /= y;
                }
            }
        }
        System.out.println(local);
        System.out.println(count);
    }
}
