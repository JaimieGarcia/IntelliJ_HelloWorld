import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {

        int count = 0, sum = 0, num, min = 0, max = 0;

        Scanner input = new Scanner(System.in);
        {
            System.out.println("Please input the first number: ");
            int num1 = input.nextInt();

            System.out.println("Please input the second number: ");
            int num2 = input.nextInt();

            System.out.println("Please input the third number: ");
            int num3 = input.nextInt();

            System.out.println("Please input the fourth number: ");
            int num4 = input.nextInt();

            System.out.println("Please input the fifth number: ");
            int num5 = input.nextInt();

            int results = num1 * num2 * num3 * num4 * num5;
            System.out.println("The product of these digits is: " + results);

            do {
                num = input.nextInt();
                sum = num1 + num2 + num3 + num4 + num5;
                System.out.println("The sum is these digits is: " + sum);
                count++;
            } while (count < 5); {
                if (num > max) {
                max = num;
                }

                if (num < min) {
                min = num;
                }
            }

            System.out.println("The largest of these digits is: " + max);
            System.out.println("The smallest of these digits is: " + min);
        }

    }
}
