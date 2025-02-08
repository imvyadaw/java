
import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the vaalues: ");
            int x=sc.nextInt();
            if(x%2==0){
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
            }
        }
    }
}
