package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (inputArr.length > 1) {
            int[] condense = new int[inputArr.length - 1];
            for (int i = 0; i < inputArr.length - 1; i++) {
                condense[i] = inputArr[i] + inputArr[i + 1];
            }
            inputArr = condense;
        }
        System.out.println(inputArr[0]);
    }
}
