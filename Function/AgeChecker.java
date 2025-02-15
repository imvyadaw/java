import java.util.Scanner;

public class AgeChecker{
    public static void CheckerAge(){
        Scanner scanner = new Scanner(System.in);
        int age;
        while(true){
            System.out.print("Enter your age: ");
            age=scanner.nextInt();
            if(age>=0 && age<=100){
                break;
        }else{
            System.out.print("Invalid age. Please enter a valid age.");
        }
    }
    if(age>=18){
        System.out.print("You are an adult.");
    }else{
        System.out.print("You are a minor.");
    }
    scanner.close();
}
    public static void main(String[] args) {
        CheckerAge();
    }
}