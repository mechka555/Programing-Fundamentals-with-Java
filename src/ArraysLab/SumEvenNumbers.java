package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();

//        String[] inputArr = scanner.nextLine().split(" ");
//
//        int[] numsArr = new int[inputArr.length];
//
//        for (int i = 0; i < numsArr.length; i++) {
//            numsArr[i] = Integer.parseInt(inputArr[i]);
//        }
        int[] numsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr[i] % 2 == 0) {
                evenSum += numsArr[i];
            }
        }
        System.out.println(evenSum);
    }
}
