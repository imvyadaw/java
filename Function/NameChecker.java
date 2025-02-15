// public class NameChecker {
//     public static void CheckNames(String[]names){
//         for(String name: names){
//             System.out.println("Current name:"+name);
//             if(name.equalsIgnoreCase("Nisha")){
//                 System.out.println("Name is Nisha");
//                 break;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         String[] names={"Anjali", "Pooja", "Sneha", "Riya", "Neha", "Simran", "Nisha", "Priya", "Kajal", "Sonia"};
//         CheckNames(names);
//     }
// }

// import java.util.Scanner;

// public class NameChecker {
    
//     public static void checkNames(String[] names) {
//         for (String name : names) {
//             System.out.println("Current name: " + name);

//             // If the name is "Nisha", break the loop
//             if (name.equalsIgnoreCase("Nisha")) {
//                 System.out.println("Stopping... 'Nisha' found.");
//                 break;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String[] names = new String[10]; // Array to store 10 names

//         // Take input for 10 names
//         System.out.println("Enter 10 names:");
//         for (int i = 0; i < 10; i++) {
//             System.out.print("Enter name " + (i + 1) + ": ");
//             names[i] = scanner.nextLine();
//         }

//         // Call the function to check names
//         checkNames(names);
        
//         scanner.close();
//     }
// }

import java.util.Scanner;

public class NameChecker {

    public static void checkNames() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names (type 'Vishal' to stop):");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter name " + i + ": ");
            String name = scanner.nextLine();

            // If the name is "Nisha", break the loop immediately
            if (name.equalsIgnoreCase("Vishal")) {
                System.out.println("Stopping... 'Vishal' entered.");
                break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        checkNames(); // Call the function
    }
}
