import java.util.*;

public class AssignmentPA_303_2_3 {
    public static void main(String[] args) {
        // Number 1
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        double d = x;
        System.out.println(d); // 4.0
        System.out.println(Integer.toBinaryString(x)); // 100

        List<Integer> values = Arrays.asList(9, 17, 88);

        for (Integer i : values) {
            System.out.println(Integer.toBinaryString(i));
            i = i << 1;
            double dub = i;
            System.out.println(dub);
            System.out.println(Integer.toBinaryString(i));
        }

        /* Number 5
        Write a program that declares an integer variable, assigns a number,
        and uses a postfix increment operator to increase the value.
        Print the value before and after the increment operator.
        */

        int problemFiveInt = 10;
        System.out.println(problemFiveInt);
        problemFiveInt++;
        System.out.println(problemFiveInt);
    }
}
