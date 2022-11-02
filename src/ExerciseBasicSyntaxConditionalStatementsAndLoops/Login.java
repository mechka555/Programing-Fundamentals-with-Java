package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String login = scanner.nextLine();
        int count = 0;

        StringBuilder pass = new StringBuilder();
        pass.append(login);
        pass.reverse();
        String pass1 = pass.toString();

        while (true) {
            String probe = scanner.nextLine();
            if (probe.equals(pass1)) {
                System.out.printf("User %s logged in.", login);
                break;
            } else if (count < 3) {
                System.out.printf("Incorrect password. Try again.%n");
                count++;
            } else {
                System.out.printf("User %s blocked!", login);
                break;
            }
        }
    }
}
