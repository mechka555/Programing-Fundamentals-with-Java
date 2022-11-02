package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int input3 = Integer.parseInt(input);
        int sumTotal = 0;

        for (int i = 0; i < input.length(); i++) {
            int input2 = Integer.parseInt("" + input.charAt(i));
            int sum = 1;
            for (int j = 1; j <= input2; j++) {
                sum *= j;
            }
            sumTotal += sum;
        }
        if (sumTotal == input3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
