import java.util.Scanner;

public class  Sum{
    public static void summ(int a,int b){
        int sum=a+b;
        System.out.println("Summ of two numbers is "+sum);
        return;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        summ(a,b);
        }
    }