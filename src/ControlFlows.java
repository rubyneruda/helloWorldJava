import java.util.Scanner;
public class ControlFlows {
    public static void main(String[] args) {
        /*
        1. Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if statement to print out “Less than 10” if x is less than 10. Change x to equal 15, and notice the result (console should not display anything).
         */
        System.out.println("Problem 1:");
        int x;
        x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }

        /*
        Output:

        Less than 10

         */

        /*
        2. Write a program that declares 1 integer variable x, and then assigns 7 to it. Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
         */
        System.out.println("\nProblem 2:");
        x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }

        /*
        Output:

        Less than 10
        Greater than 10

         */

        /*
        3. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else-if statement that prints out “Less than 10” if x is less than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
         */

        System.out.println("\nProblem 3:");
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }
        x = 50;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }

        /*
        Output:

        Between 10 and 20
        Greater than or equal to 20

         */

        /*
        4. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
         */

        System.out.println("\nProblem 4:");
        x = 15;

        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
        x = 5;

        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }

        /*
        Output:
        In range
        Out of range
         */

        /*
        5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
            A: 90-100
            B: 80-89
            C: 70-79
            D: 60-69
            F: <60
           Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range” if the score is less than 0 or greater than 100.

         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from range 0 through 100: ");
        int num = input.nextInt();
        if (num > 100 || num < 0) {
            System.out.println("Score out of range");
        } else if (num >= 90) {
            System.out.print("A");
        } else if (num >= 80) {
            System.out.print("B");
        } else if (num >= 70) {
            System.out.print("C");
        } else if (num >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }

    }
}
