package LabDataTypesAndVariables;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sum = "";

        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            sum = input + " " + sum;
        }
        System.out.println(sum);
    }
}
