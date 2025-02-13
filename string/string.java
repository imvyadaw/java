package string;

import java.util.Scanner;

// public class string {
//     public static void main(String[] args) {
//         String name="vishal yadaw";
//         System.out.println(name);
//     }
// }

// public class string {
//     public static void main(String[] args) {
//         int a=6;
//         float b=5.64850f;
//         System.out.printf("the value of a  is %d and b is %f",a,b);

//     }
// }

// public class string {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter your name: ");
//         String st=sc.next();  //show half name enter 
//         // String st=sc.nextLine(); show full name
//         System.out.println(st);
//         sc.close();
//     }
// }
public class string {
    public static void main(String[] args) {
        String name= "Vishal Yadaw";
        // int value=name.length();
        String value=name.toLowerCase();
        // String value2=name.toUpperCase();
        
        System.out.println(name);
        // System.out.println("number of word: "+value);
        // System.out.println("lower case: "+value2);
        System.out.println("lower case: "+value);
        // System.out.println(name.trim()); trim spaace in word 
        // System.out.println(name.replace("V","n")); output nishal Yadaw
    }
}

