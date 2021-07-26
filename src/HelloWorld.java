import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // This is a comment (command + /)
        // Code below will be squished because you need an ln or add a line break yourself
        // System.out.print("Hello");
        // System.out.print("Goodbye");

        // Need a scanner for user input. Will need the code on line 1
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String firstName = input.nextLine();
//        System.out.printf("Hello %s!\n", firstName);
//        System.out.printf("Goodbye %s!\n", firstName);

//        Scanner userInput = new Scanner(System.in);
//            System.out.println("What is your first name?");
//            String firstName = userInput.nextLine();
//            System.out.println("What is your last name?");
//            String lastName = userInput.nextLine();
//            System.out.printf("Hello %s %s!\n", firstName, lastName);
//            System.out.printf("Goodbye %s, %s!\n", lastName, firstName);

        // MadLib exercise
//        Scanner userInput = new Scanner(System.in);
//            System.out.println("Enter a name: ");
//            String name = userInput.nextLine();
//            System.out.println("Give me an adverb: ");
//            String adverb = userInput.nextLine();
//            System.out.println("Give me an adjective: ");
//            String adjective = userInput.nextLine();
//            System.out.println("Give me a noun: ");
//            String noun = userInput.nextLine();
//            System.out.println("Give me another noun: ");
//            String nounTwo = userInput.nextLine();
//            System.out.println("Give me a number: ");
//            String number = userInput.nextLine();
//            System.out.println("Give me your name: ");
//            String yourName = userInput.nextLine();
//
//            System.out.printf("Here is your story: \n");
//            System.out.printf("\n Dear %s,", name);
//            System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
//            System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
//            System.out.printf("\n Sincerely, %s \n", yourName);

        //integer called number
//        int number;

        //boolean called answer
//        boolean answer = true;

        // legal but not recommended
//        int pop, top, can;

        // recommended
//        int pop;
//        int top;
//        int can;

        // legal, but runs the risk of forgetting to initialize (assign values)
//        int pop, top, can;

        // legal but not recommended
//        int pop=0, top=0, can=0;

        // recommended
//        int pop = 0;
//        int top = 0;
//        int can = 0;

        // Google ASCII value - char is primitive
//        char answer = 'Y';             // 'Y' as the explicit character value
//        char middleInitialC = 0x0043;  // 'C'as a hexidecimal
//        char lowerCaseA = '\u0061';      // 'a' as a unicode
//        char capitalK = 75;            // 'K' as an integer value
//
//        System.out.println(answer);
//        System.out.println(middleInitialC);
//        System.out.println(lowerCaseA);
//        System.out.println(capitalK);

        // Data Types: Long Numbers
//        long BigLong = 230L;          // long (l, L)
//        float SomeFloat = 927.42f;    // float (f, F)
//        double someDbl = 392.2d;      // double (d, D)
//        double wishfulSalary = 123_000_100_325.0d; // stored/printed as 123000100325.0

        // Casting
//        int smallInt = 120;   //int is 4 bytes
//        int biggerInt = 550;  //int is 4 bytes
//
//        //downcasting 4 bytes into 1 byte
//        byte b1= (byte)smallInt;  //value in both will be 120
//        byte b2= (byte)biggerInt; //value out of range, will be truncated
//
//        //downcasting 4 bytes into 2 bytes
//        short s1= (short)biggerInt;   //value in range, no truncation

        // Modulus
//        int result1 = 10 % 5;
//        System.out.println(result1);
        // because 10 is completely divisible by 5

//        int result2 = 15 % 6;
//        System.out.println(result2);
        //the remainder of the division of 15 by 6 is 3


        // Operators
//        int num1 = 2; //=> 2
//        int num2 = 4; //=> 4
//
//        num1 += num2; //value of num1 = 6: same as num1 = num1 + num2
//        System.out.println(num1);
//        num2 -= num1; //value of num2 = 2
//        System.out.println(num2);
//        num1 *= num2; //value of num1 = 8
//        System.out.println(num1);
//        num2 /= num1; //value of num2 = 2
//        System.out.println(num2);

        // Logical Operators
//        int sum = 15;
//        if (sum > 13 && sum < 26) {
//            System.out.println("Right in the sweet spot.");
//        } else {
//            System.out.println("Too little, too much.");
//        }

        // when comparing strings remember to use equals() method
//        String choice = "credits";
//        if (choice.equals("cash") || choice.equals("credit")) {
//            System.out.println("Thanks for shopping at our store.");
//        } else {
//            System.out.println("Sorry, we don't accept checks.");
//        }

        // MadLib Age Limit
//        int ageLimit = 18;
//        System.out.println("How old are you?");
//        Scanner userInput = new Scanner(System.in);
//        int age = Integer.parseInt(userInput.nextLine());
//
//        if (age < ageLimit){
//            System.out.println("You are too young! Sorry!");
//            System.exit(0);
//        } else {
//            //Program continues as normal because they past the age test!
//            System.out.println("Enter a name: ");
//            String name = userInput.nextLine();
//            System.out.println("Give me an adjective: ");
//            String adjective = userInput.nextLine();
//            System.out.println("Give me a verb: ");
//            String verbOne = userInput.nextLine();
//            System.out.println("Give me another verb: ");
//            String verbTwo = userInput.nextLine();
//            System.out.println("Give me a number: ");
//            String number = userInput.nextLine();
//            System.out.println("Give me your name: ");
//            String yourName = userInput.nextLine();
//
//            System.out.printf("Here is your story: \n");
//            System.out.printf("\n Dear %s,", name);
//            System.out.printf("\n You are extremely %s and I want to %s you!", adjective, verbOne);
//            System.out.printf("\n I want to %s you %s times.", verbTwo, number);
//            System.out.printf("\n Sincerely, %s \n", yourName);
//        }

        // Naming Conventions
//        // known as camel case, first word lower case and subsequent words capitalized
//        int currentScoreOfGame;
//
//        // known as snake case, all lower case with an underscore between each word
//        //this is not really a convention often used in java, but might appear in other languages
//        int current_score_of_game;
//
//        // known as Pascal case, first letter of each word capitalized
//        int FinalScoreOfGame;
//
//        // leading underscore sometimes used for short-lived or special purpose names
//        int _membersOutOfTown;
//
//        // Not used often in Java, more often in JavaScript to denote a variable tied to an event
//        int $amountOfBill;
//
//        // All Caps with an underscore between words is a common convention for constant values
//        double TAX_RATE = 7.0;

        // Wrappers
//        int a = 5;
//        int b = 6;
//        System.out.println(Integer.compare(a, b));

        // The String Type
//        String s1 = "Hello ";
//        String s2 = new String("World");
//        System.out.println(s1 + s2);
//
//        int len = s1.length();  // equals 5
//        System.out.println(len);
//        boolean sameLen = (s1.length() == s2.length()); // equals true
//
//        String greeting = s1.concat(s2);  // greeting will now hold "HelloWorld" with no space.
//        String longGreeting = s1.concat(" ").concat(s2).concat(" from Java!");
//
//        System.out.println(greeting);
//        System.out.println(longGreeting);
//        // longGreeting will now be "Hello World from Java!"
//
//        // Alternative method
//        String longGreeting2 = s1 + " " + s2 + " from Java!";
//        System.out.println(longGreeting2);
//        // longGreeting will now be "Hello World from Java!"
//
//        int ndex = longGreeting.indexOf('W');             // ndex equal to 6
//        int last = longGreeting.lastIndexOf('o');         // last equal to 14
//        boolean contains = longGreeting.contains("fro");  // true
//        boolean starts = longGreeting.startsWith("h");    // false
//        char charVal = longGreeting.charAt(10);           // 'd'
//        String lan = longGreeting.substring(17);          // lan = Java!
//        String planet = longGreeting.substring(6, 11);    // planet = World
//        boolean noNums = longGreeting.matches("d+");      // false - regular expression search for any number

        // String Comparison
        //Using Object.equals() checks value equality and is best for string comparisons

//        String word1 = "Hello";
//        String word2 = "Hello";
//        String word3 = "Goodbye";
//
//        word1.equals(word2); //true
//        word1.equals(word3); //false
//
//        // These two have the same value
//        new String("Hello World").equals("Hello World"); // --> true
//
//        // "==" checks if they are the same object, and they are not the same object
//        //One is a string object the other is a literal
//        new String("Hello World") == "Hello World"; // --> false
//
//        // These are both String objects, but not the same
//        new String("Hello World") == new String("Hello World"); // --> false
//
//        // Literals are interned strings and seen as the same object by the compiler
//        "test" == "test"; // --> true
//
//        // String literals are concatenated by the compiler yet the results are not seen as the same object.
//        "Hello World" == "Hello " + "World"; // --> false
    }
        }
