package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people =Integer.parseInt(scanner.nextLine());
        int capacityE = Integer.parseInt(scanner.nextLine());

        int times = (int) Math.ceil((double) people / capacityE);
        System.out.println(times);
    }
}
