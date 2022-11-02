package LabBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameCountry = scanner.nextLine();

        if (nameCountry.equals("England") || nameCountry.equals("USA")) {
            System.out.println("English");
        } else if (nameCountry.equals("Spain") || nameCountry.equals("Argentina") || nameCountry.equals("Mexico")) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
