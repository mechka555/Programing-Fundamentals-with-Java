package LabBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesTotal = hours * 60 + minutes + 30;

        int hoursAfter = minutesTotal / 60;
        int minutesAfter = minutesTotal % 60;

        if (hoursAfter == 24) {
            hoursAfter = 0;
        }
        System.out.printf("%d:%02d", hoursAfter, minutesAfter);
    }
}
