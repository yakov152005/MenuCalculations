import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menuOptions();
        manuCalculation();
    }
    public static void menuOptions() {
        print("|Welcome to the menu|");
        print("Please select the desired option:");
        print("""
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
                    calculationQuadraticEquation();
                    break;
                case 10:

                    break;
                case 11:
                    fibonacciSeries();
                    break;
                case 12:

                    break;
                default:
                    print("You entered an incorrect number, please try again :)");
                    break;
            }
            menuOptions();
        }
        print("GOOD BYE :)");
    }
    public static int getInput() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    public static char getCharacter() {
        Scanner s = new Scanner(System.in);
        return s.next().charAt(0);
    }
    public static void print(String print) {
        System.out.println(print);
    }
    public static void println(long println) {
        System.out.println(println);
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
    public static void circleCalculation() {
        double pai = 3.14;
        print("Please enter the radius:");
        double radius = getInput();
        double scopeCircle = (2 * pai * radius);
        double areaCircle = (pai * (radius * radius));
        print("The radius of circle is: " + radius);
        print("The Scope Circle is: " + scopeCircle);
        print("The Area Circle is: " + areaCircle);
    }
    public static void temperatureConversion() {
        print("What is the starting base you want in temperatures (C / F) ?");
        char ch = getCharacter();
        if (ch == 'C' || ch == 'c') {
            print("Enter the number temperature");
            int temperature = getInput();
            double fahrenheit = (temperature * 1.8) + 32;
            print("|Fahrenheit| = " + fahrenheit);
        } else if (ch == 'F' || ch == 'f') {
            print("Enter the number temperature");
            int temperature = getInput();
            double result = ((temperature - 32) * 5);
            double celsius = result / 9;
            print("|Celsius| = " + celsius);
        } else {
            print("character does not exist");
        }
    }
    public static boolean isNegativeNumber(int number){
        return  number <= 0;
    }
    public static long calculateFactorial(int number){
        long factorial = 1;
        for (int i = 1 ; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void assemblyCalculation() {
        boolean temp ;
        do {
            print("Enter a positive number for assembly result calculation: ");
            int assembly = getInput();
            if (isNegativeNumber(assembly)) {
                temp =true;
            }else {
                println(calculateFactorial(assembly));
                temp = false;
            }
        }while (temp) ;
    }
    public static void sumNaturalNumbers() {
        boolean check = true;
        do {
            print("Enter the start: ");
            int start = getInput();
            print("Enter the end: ");
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
                print("Please insert numbers that are not equal to each other!");
                continue;
            }
            print("The sum of natural numbers in the range is: " + sum);
        } while (check);
    }
    public static void primeNumber() {
        print("Enter a positive whole number: ");
        int prime = getInput();
        if (prime > 0) {
            if (isPrime(prime)) {
                print("The number: " + prime + " is a prime number");
            } else {
                print("The number " + prime + " is NOT a prime number");
            }
        } else {
            print("You entered an incorrect number");
        }
    }
    public static boolean isFiveDigitsNumber(int number){
        return number>=10000 && number <=99999;
        }
    public static boolean isPalindromeNumber(int number){
                int originalNum = number;
                int reversNum = 0;
                while (number > 0){
                    int digit = number %10;
                    reversNum = reversNum *10 +digit;
                    number /=10;
                }
                return  originalNum == reversNum;
            }
    public static void fiveDigitPalindromeNumber() {
        boolean temp = false;
        do {
            print("Enter a Five-digit number:");
            int palindrome = getInput();
            if (isFiveDigitsNumber(palindrome)) {
                temp = true;
                if (isPalindromeNumber(palindrome)) {
                    print("| The number is palindrome |");
                } else {
                    print("|The number is NOT palindrome |");
                }
            }
        }while (!temp);
    }
    public static void primeNumbersRange() {
        print("Enter a Start number: ");
        int start = getInput();
        print("Enter a end number: ");
        int end = getInput();
        boolean foundPrimes = false;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                foundPrimes = true;
            }
        }if (!foundPrimes) {
            print("No prime numbers found in the range.");
        }
    }
    public static void greatestCommonDivisor(){
        print("Enter a Two Number for GCD: ");
        int sum = 0;
        int numOne = getInput();
        int numTwo = getInput();
        if (numTwo > numOne) {
            sum = numTwo - numOne;
        }else {
            sum = numOne - numTwo;
        }
        if (numTwo  % sum == 0 && numOne % sum ==0){
            println(sum);
        }
    }
    public static void calculationQuadraticEquation(){
        print("Enter  numbers for coefficients A, B and C: ");
        int numA = getInput();
        int numB = getInput();
        int numC = getInput();
        int sum = ((numB*numB) + (-4 * numA * numC) );
        if (sum >= 0) {
            double sqrt = (Math.sqrt(sum));
            double result1 = ((-numB + sqrt) / (2 * numA));
            double result2 = ((-numB - sqrt) / (2 * numA));
            if (result1 == result2) {
                print("X1 = " + result1);
            }else{
                print("X1 = " + result1 +" | " +" X2 = " +result2);
            }
        }else {
            print("Math ERROR, There is no solution");
        }
    }
    public static void calculationCompoundInterest(){
    }
    public static void fibonacciSeries(){
        int result = 1;
        int fibonacci = 1;
        System.out.println("Enter a number for fibonacci Series: ");
        int fibonacciSeries = getInput();
        for (int i = 1 ; i <= fibonacciSeries ; i+=fibonacci){
             result = i;
            if (i ==fibonacciSeries) {
                break;
            }
               fibonacci +=  i;
               }
               if (result == fibonacciSeries || fibonacci == fibonacciSeries || fibonacciSeries == 0) {
                   print("The number is part of the Fibonacci series");
               }else {
                   print("The number is NOT part of the Fibonacci series");
               }
        }
    public static void narcissisticNumber (){

        }
    }

