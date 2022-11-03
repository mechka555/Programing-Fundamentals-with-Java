package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] passArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            passArr[i] = currentNum;
            sum += currentNum;
        }
        for (int item :
                passArr) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
