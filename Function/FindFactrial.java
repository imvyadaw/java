import java.util.Scanner;

public class FindFactrial{
    public static void PrintFactroial(int n){
        int Factrial=1;
        for(int i=1;i<=n;i++){
            Factrial=Factrial*i;
        }
        System.out.println("Factorial of "+n+" is "+Factrial);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        PrintFactroial(n);
    }
}