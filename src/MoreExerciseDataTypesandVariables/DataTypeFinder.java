package MoreExerciseDataTypesandVariables;

import java.lang.reflect.Field;
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.contains(".")) {
            System.out.printf("%s is double type", input);
        } else if (input.length() == 0) {

        }
    }
}
