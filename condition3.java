
import java.util.Scanner;

public class condition3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        if (a==b){
            System.out.println("a and b are equal");
        }else if(a>b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }
    }
}
