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

public class classwork{
    static int add (int a , int b){
        int res = a + b ;
        return res;
    }      
    public static void main(String[] args) {
        int res = add ();
        System.out.println(res);
    }
        
}