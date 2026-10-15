import java.util.Scanner;

class reversetraversal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("the reverse of array is: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}