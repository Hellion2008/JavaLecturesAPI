package s1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        task6array();
        task7list();
    }

    static void task6array(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter length of array: ");
            int array[] = new int[sc.nextInt()];
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Enter %d element: ", i);
                array[i] = sc.nextInt();
                if (i % 2 == 0)
                        sum += array[i];
            }
            System.out.println(sum);
            for (int i = 0; i < array.length; i += 2) {
                System.out.println(array[i]);
            }

        }
    }

    static  void task7list(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter list: ");
            String[] s = scanner.nextLine().split(" ");
            int[] arr = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]){
                        count++;
                    }
                }
                if (count < 2){
                    System.out.println(arr[i]);
                }
                count = 0;
            }
        }
    }
}
