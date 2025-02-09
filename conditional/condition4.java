package conditional;

import java.util.Scanner;

public class condition4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the button: ");
        int button=sc.nextInt();
        if(button==1){
            System.out.println("Button 1 is pressed");
        }
        else if(button==2){
            System.out.println("Button 2 is pressed");
        }
        else if(button==3){
            System.out.println("Button 3 is pressed");
        }
        else{
            System.out.println("Invalid button");
        }
    }
}
