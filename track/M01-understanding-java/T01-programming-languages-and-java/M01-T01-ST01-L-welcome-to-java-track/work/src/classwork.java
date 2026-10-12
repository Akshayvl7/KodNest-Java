// public class classwork {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 3; i++){
//             for (int j = 1; j <=2 ; j++){
//                 System.out.println(i+","+j);
//             }

//         }
//     }
// }
// public class classwork {
//     public static void main(String[] args) {    
// int i = 1;
// while (i <= 3){
//     int j = 1;
//     while(j <= 2){
//         System.out.println(i+","+j);
//         j++;
//     }
//     i++;
//     }
// }
// }


// public class classwork {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
//             int j = 1;
//             do { 
//                 System.out.println(i+","+j);
//                 j++;
//             } 
//             while (j <= 2);
//             i++;                 
//         } while (i <= 3);
//     }
// }


// import java.util.*;
// class Student{
//     int id;
//     String name;
//     String course;
//     double javascore;
// }
// public class classwork{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         Student s1 = new Student();
//         Student s2 = new Student();  
        
//         s1.id = scanner.nextInt();
//         s1.name = scanner.next();
//         s1.course = scanner.next();
//         s1.javascore = scanner.nextDouble();

//         System.out.println(s1.id);
//         System.out.println(s1.name);
//         System.out.println(s1.course);
//         System.out.println(s1.javascore);

//         s2.id=scanner.nextInt();
//         s2.name=scanner.next();
//         s2.course=scanner.next();
//         s2.javascore=scanner.nextDouble();

//         System.out.println(s2.id);
//         System.out.println(s2.name);
//         System.out.println(s2.course);
//         System.out.println(s2.javascore);

//         System.out.println("--- Score Comparison ---");
//         if (s1.javascore > s2.javascore) {
//             System.out.println(s1.name + " has a higher Java score: " + s1.javascore);
//         } else if (s2.javascore > s1.javascore) {
//             System.out.println(s2.name + " has a higher Java score: " + s2.javascore);
//         } else {
//             System.out.println("Both students have equal Java scores: " + s1.javascore);
//         }

//         scanner.close();
//     }
// }

// public class classwork{
//     static int add (int a , int b){
//         int res = a + b ;
//         return res;
//     }      
//     public static void main(String[] args) {
//         int res = add ();
//         System.out.println(res);
//     }
        
// }


// import java.util.Scanner;

// public class classwork {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter size of array: ");
//         int size = scanner.nextInt();
        
//         int num[] = new int[size];
        
//         // Take array elements as input from the user
//         System.out.println("Enter " + size + " integers:");
//         for (int i = 0; i < num.length; i++) {
//             num[i] = scanner.nextInt();
//         }
        
//         // Display elements and calculate sum
//         int sum = 0;
//         System.out.println("Array elements:");
//         for (int i = 0; i < num.length; i++) {
//             System.out.println(num[i]);
//             sum = sum + num[i];
//         }
        
//         System.out.println("Total count of integers: " + num.length);
//         System.out.println("Sum of integers: " + sum);
        
//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class classwork {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
        
//         System.out.print("Enter a 3 digit number: ");
//         int num = s.nextInt();
        
//         int temp = num;
//         int sum = 0;
       
//         while (temp > 0) {
//             int digit = temp % 10;
//             sum += (digit * digit * digit);
//             temp = temp / 10;
//         }
        
//         if (sum == num) {
//             System.out.println(num + " is an armstrong number.");
//         } else {
//             System.out.println(num + " is not an armstrong number.");
//         }
        
//         s.close();
//     }
// }



// import java.util.Scanner;

// public class classwork {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter size of array: ");
//         int size = scanner.nextInt();
        
//         int num[] = new int[size];
        
//         // Take array elements as input from the user
//         System.out.println("Enter " + size + " integers:");
//         for (int i = 0; i < num.length; i++) {
//             num[i] = scanner.nextInt();
//         }
        
//         // Display elements and calculate sum
//         int sum = 0;
//         System.out.println("Array elements:");
//         for (int i = 0; i < num.length; i++) {
//             System.out.println(num[i]);
//             sum = sum + num[i];
//         }
        
//         System.out.println("Total count of integers: " + num.length);
//         System.out.println("Sum of integers: " + sum);
//     }
// }



import java.util.Scanner;
public class classwork{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int [] m = new int[size];
        int i ;
        int total = 0 ;
        int len = m.length();
        for (i = 0 ; i < len ; i ++){
            System.out.println("enter the values: ");
            m[i] =sc.nextInt();
            
        }
          System.out.println("array elements: "  )
          for(i = 0 ; i <= len ; i ++){
            total += total[i];
            System.out.println("total: " + total[i]);
          }
    }
}