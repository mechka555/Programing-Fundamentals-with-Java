package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (input != 0) {
            sum += input % 10;
            input /= 10;
        }
        System.out.println(sum);
    }
}
