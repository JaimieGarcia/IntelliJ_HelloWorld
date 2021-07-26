import java.util.*;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // User inputs 5 numbers
        for (int i =0; i <=4;i++ ) {
            System.out.println("Enter a number: ");
            numbers.add(userInput.nextInt());
        }

        // Sum of array list
        int sum = 0;
        for (Integer value : numbers) {
            sum += value;
        }
        System.out.println(sum);


        // Product of array list
        long product = 1;
        for (int i = 0; i<numbers.size(); i++) {
            product *= numbers.get(i);
        }

        // Maximum in array list
        int max = 0;
        for (int i = 0; i<numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        // Min in array list
        int min = numbers.get(0);
        for (int i = 0; i<numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }

        System.out.printf("\nThe sum is %s \n", sum);
        System.out.printf("The product is %s \n", product);
        System.out.printf("The largest number is %s \n", max);
        System.out.printf("The smallest number is %s \n", min);


    }
}
