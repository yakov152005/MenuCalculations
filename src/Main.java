import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menuOptions();
        manuCalculation();
    }
    public static void menuOptions() {
        System.out.println("|Welcome to the menu|");
        System.out.println("Please select the desired option:");
        System.out.println("""
                1 - Calculation of area and circumference of a circle.
                2 - Converting temperatures from the Celsius base to the Fahrenheit base and vice versa.
                3 - Calculation of assembly result.
                4 - Calculation of the sum of the natural numbers in the range.
                5 - Checking whether any number is prime.
                6 - Checking whether a five-digit number is a palindrome.
                7 - Print prime numbers in a range.
                8 – GCD calculation.
                9 - Calculating the results of a quadratic equation.
                10 - Calculation of compound interest.
                11 - Checking whether a number is part of the Fibonacci series.
                12 - Printing a narcissistic number.
                0 - to exit the program.\s""");
    }
    public static int getInput() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    public static boolean isPrime(int prime) {
            if (prime <= 1) {
                return false;
            }
            for (int i = 2; i * i <= prime; i++) {
                if (prime % i == 0) {
                    return false;
                }
            }
            return true;
        }
    public static void manuCalculation() {
        while (true) {
            int calculationType = getInput();
            if (calculationType == 0)
                break;
            switch (calculationType) {
                case 1:
                    circleCalculation();
                    break;
                case 2:
                    temperatureConversion();
                    break;
                case 3:
                    assemblyCalculation();
                    break;
                case 4:
                    sumNaturalNumbers();
                    break;
                case 5:
                    primeNumber();
                    break;
                case 6:
                    fiveDigitPalindromeNumber();
                    break;
                case 7:
                    primeNumbersRange();
                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:

                    break;
                case 11:

                    break;
                case 12:

                    break;
                default:
                    System.out.println("You entered an incorrect number, please try again :)");
                    break;
            }
            menuOptions();
        }
        System.out.println("GOOD BYE :)");
    }
    public static void circleCalculation() {
        double pai = 3.14;
        System.out.println("Please enter the radius:");
        double radius = getInput();
        double scopeCircle = (2 * pai * radius);
        double areaCircle = (pai * (radius * radius));
        System.out.println("The radius of circle is: " + radius);
        System.out.println("The Scope Circle is: " + scopeCircle);
        System.out.println("The Area Circle is: " + areaCircle);
    }
    public static void temperatureConversion() {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the starting base you want in temperatures (C / F) ?");
        char ch = s.next().charAt(0);
        if (ch == 'C' || ch == 'c') {
            System.out.println("Enter the number temperature");
            int temperature = getInput();
            double fahrenheit = (temperature * 1.8) + 32;
            System.out.println("|Fahrenheit| = " + fahrenheit);
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("Enter the number temperature");
            int temperature = getInput();
            double result = ((temperature - 32) * 5);
            double celsius = result / 9;
            System.out.println("|Celsius| = " + celsius);
        } else {
            System.out.println("character does not exist");
        }
    }
    public static void assemblyCalculation() {
        System.out.println("Enter a number for assembly result calculation: ");
        int assembly = getInput();
        long counter = 1;
        for (int i = 1; i <= assembly; i++) {
            counter = counter * i;
        }
        System.out.println(counter);
    }
    public static void sumNaturalNumbers() {
        boolean check = true;
        do {
            System.out.println("Enter the start: ");
            int start = getInput();
            System.out.println("Enter the end: ");
            int end = getInput();
            int sum = 0;
            if (start < end) {
                for (int i = start; i <= end; i++) {
                    sum += i;
                    check = false;
                }
            } else if (end < start) {
                for (int i = end; i <= start; i++) {
                    sum += i;
                    check = false;
                }
            } else {
                System.out.println("Please insert numbers that are not equal to each other!");
                continue;
            }
            System.out.println("The sum of natural numbers in the range is: " + sum);
        } while (check);
    }
    public static void primeNumber() {
        System.out.println("Enter a positive whole number: ");
        int prime = getInput();
        if (prime > 0) {
            if (isPrime(prime)) {
                System.out.println("The number: " + prime + " is a prime number");
            } else {
                System.out.println("The number: " + prime + " is NOT a prime number");
            }
        }else {
            System.out.println("You entered an incorrect number");
        }
    }
    public static void fiveDigitPalindromeNumber() {
        //System.out.println("Enter a Five-digit number: ");
        // int palindrome = getInput();
    }
    public static void primeNumbersRange() {
        System.out.println("Enter a Start number: ");
        int start = getInput();
        System.out.println("Enter a end number: ");
        int end = getInput();
        boolean foundPrimes = false;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                foundPrimes =true;
            }
        }
        if (!foundPrimes) {
            System.out.println("No prime numbers found in the range.");
        }

    }
}







