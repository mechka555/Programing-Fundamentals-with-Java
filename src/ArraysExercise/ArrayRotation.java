package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int local = numArr[0];
            for (int j = 0; j < numArr.length - 1; j++) {
                numArr[j] = numArr[j + 1];
            }
            numArr[numArr.length-1] = local;
        }
        for (int item :
                numArr) {
            System.out.print(item + " ");
        }
    }
}
