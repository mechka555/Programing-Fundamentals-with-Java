package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int total = 255;

        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input > total) {
                System.out.println("Insufficient capacity!");
            } else {
                total -= input;
            }
        }
        System.out.println(255 - total);
    }
}
