package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count =Integer.parseInt(scanner.nextLine());
        double volume = Double.MIN_VALUE;
        String biggest = "";
        for (int i = 0; i < count; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volumeProbe = Math.PI * radius * radius * height;
            if (volumeProbe > volume) {
                volume = volumeProbe;
                biggest = model;
            }
        }
        System.out.println(biggest);
    }
}
