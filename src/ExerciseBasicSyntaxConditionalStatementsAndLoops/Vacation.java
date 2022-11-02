package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double sum = 0;

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        if (count > 29) {
                            sum = count * 8.45 * 0.85;
                        } else {
                            sum = count * 8.45;
                        }
                        break;
                    case "Business":
                        if (count > 99) {
                            sum = (count - 10) * 10.90;
                        } else {
                            sum = count * 10.90;
                        }
                        break;
                    case "Regular":
                        if (count > 9 && count < 21) {
                            sum = count * 15 * 0.95;
                        } else {
                            sum = count * 15;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        if (count > 29) {
                            sum = count * 9.80 * 0.85;
                        } else {
                            sum = count * 9.80;
                        }
                        break;
                    case "Business":
                        if (count > 99) {
                            sum = (count - 10) * 15.60;
                        } else {
                            sum = count * 15.60;
                        }
                        break;
                    case "Regular":
                        if (count > 9 && count < 21) {
                            sum = count * 20 * 0.95;
                        } else {
                            sum = count * 20;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        if (count > 29) {
                            sum = count * 10.46 * 0.85;
                        } else {
                            sum = count * 10.46;
                        }
                        break;
                    case "Business":
                        if (count > 99) {
                            sum = (count - 10) * 16;
                        } else {
                            sum = count * 16;
                        }
                        break;
                    case "Regular":
                        if (count > 9 && count < 21) {
                            sum = count * 22.50 * 0.95;
                        } else {
                            sum = count * 22.50;
                        }
                        break;
                }
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
