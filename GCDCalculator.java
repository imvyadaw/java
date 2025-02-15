// 1.Enter 3 numbers from the user & make a function to print their average.
// import java.util.Scanner;

// public class AverageCalculater {
//     public static double calculateAverage(double num1,double num2,double num3) {
//         return (num1 + num2 + num3) / 3;
//     }
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         double num1=scanner.nextDouble();
//         System.out.println("Enter second number: ");
//         double num2=scanner.nextDouble();
//         System.out.println("Enter third number: ");
//         double num3=scanner.nextDouble();
//         double average=calculateAverage(num1, num2, num3);
//         System.out.println("The average of three numbers is: "+average);
//         scanner.close();
//     }
// }

// 2. Write a function to print the sum of all odd numbers from 1 to n.

// import java.util.Scanner;

// public class SumOfOddNumber{
//     public static int SumOfOddNumber(int n){
//         int sum=0;
//         for(int i=1;i<=n;i+=2){
//             sum+=i;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n=scanner.nextInt();
//         int sum=SumOfOddNumber(n);
//         System.out.println("The sum of odd numbers from 1 to "+n+" is: "+
//         sum);
//         scanner.close();
        
//     }
// }

// 3. Write a function which takes in 2 numbers and returns the greater of those two.

// import java.util.Scanner;

// public class GreaterNumber{
//     public static int FinderGreaterNumber(int num1,int num2){
//         return(num1>num2)? num1:num2;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int num1=sc.nextInt();
//         System.out.println("Enter second number: ");
//         int num2=sc.nextInt();
//         int greater=FinderGreaterNumber(num1,num2);
//         System.out.println("The greater number is: "+greater);
//         sc.close();

//     }
// }

// 4.Write a function that takes in the radius as input and returns the circumference of a circle.

// import java.util.Scanner;

// public class CircleCircumference {
    
//     // Function to calculate the circumference of a circle
//     public static double calculateCircumference(double radius) {
//         return 2 * Math.PI * radius;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the radius of the circle: ");
//         double radius = scanner.nextDouble();

//         double circumference = calculateCircumference(radius);
//         System.out.println("The circumference of the circle is: " + circumference);

//         scanner.close();
//     }
// }



//5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

// import java.util.Scanner;

// public class VotingEligibility {
    
//     // Function to check voting eligibility
//     public static boolean isEligibleToVote(int age) {
//         return age >= 18;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt();

//         if (isEligibleToVote(age)) {
//             System.out.println("You are eligible to vote.");
//         } else {
//             System.out.println("You are not eligible to vote.");
//         }

//         scanner.close();
//     }
// }


// 6.Write an infinite loop using do while condition.
// public class InfiniteLoop {
//     public static void main(String[] args) {
//         int count = 1;
//         do {
//             System.out.println("This is an infinite loop iteration: " + count);
//             count++;
//         } while (true); // Condition always true → Infinite loop
//     }
// }

// 7.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
// import java.util.Scanner;

// public class NumberCounter {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int positive = 0, negative = 0, zeros = 0;
//         char choice;

//         do {
//             System.out.print("Enter a number: ");
//             int num = scanner.nextInt();

//             if (num > 0) {
//                 positive++;
//             } else if (num < 0) {
//                 negative++;
//             } else {
//                 zeros++;
//             }

//             System.out.print("Do you want to continue? (y/n): ");
//             choice = scanner.next().charAt(0);
//         } while (choice == 'y' || choice == 'Y');

//         System.out.println("Total Positive Numbers: " + positive);
//         System.out.println("Total Negative Numbers: " + negative);
//         System.out.println("Total Zeros: " + zeros);

//         scanner.close();
//     }
// }


// 8.Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

// import java.util.Scanner;

// public class PowerOfNumber{
//     public static double power(double x,double n){
//         return Math.pow(x,n);
//     }
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the base number: ");
//         double base = scanner.nextDouble();
//         System.out.print("Enter the power: ");
//         double power = scanner.nextDouble();
//         System.out.println(base + " raised to the power of " + power + " is " +power(base,power));
//         scanner.close();
//     }
// }

// 9.Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
// import java.util.Scanner;

// public class GCDCalculator {
    
//     // Function to calculate GCD using recursion
//     public static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = scanner.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = scanner.nextInt();

//         int result = gcd(num1, num2);
//         System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);

//         scanner.close();
//     }
// }

