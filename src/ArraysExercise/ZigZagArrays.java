package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                arr1[i] = current[0];
                arr2[i] = current[1];
            } else {
                arr1[i] = current[1];
                arr2[i] = current[0];
            }
        }
        for (int item : arr1) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item : arr2) {
            System.out.print(item + " ");
        }
    }
}
