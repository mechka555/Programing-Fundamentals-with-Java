package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        while (start > 99) {
            count++;
            sum += start - 26;
            start -= 10;
        }
        sum -= 26;
        if (sum < 0) {
            sum = 0;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
