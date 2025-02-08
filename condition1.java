
import java.util.Scanner;

public class condition1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            if(age>=18){
                System.out.println("aduly");
            }else{
                System.out.println("Not adult");
            }
        }

    }
}

