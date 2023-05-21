package s1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        task6array();
        task7list();
    }

    static void task1high(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter H:");
            int h = sc.nextInt();
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();
            int days = 0, pos = 0;
            do {
                pos += a;
                days++;
                if (pos >= h)
                    pos -= b;
            } while (h >= pos);
            System.out.print("Days: ");
            System.out.println(days);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    static void task2chocolate(){
        try(Scanner sc = new Scanner(System.in)){
            String s = "2 5 4";
            String arr[] = s.split(" ");
            int d1 = Integer.parseInt(arr[0]);
            System.out.println(d1);

            System.out.println("Enter m:");
            int m = sc.nextInt();
            System.out.println("Enter n:");
            int n = sc.nextInt();
            System.out.println("Enter k:");
            int k = sc.nextInt();
            String ans = k % m == 0 || k % n == 0 ? "yes" : "no";
            System.out.println("Can we?");
            System.out.println(ans);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    static void task3sportsman(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter x:");
            double x = sc.nextDouble();
            System.out.println("Enter y:");
            int y = sc.nextInt();
            int day = 1;
            double persent = 0.1;
            while(x <= y){
                x += persent * x;
                day++;
            }
            System.out.print("Days: ");
            System.out.println(day);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    static void task4factorial(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter N:");
            int n = sc.nextInt();
            int res = 1;
            for (int i = 2; i <= n; i++) {
                res *= i;
            }
            System.out.printf("Fact %d: %d", n, res);
        }
    }

    static void task5counter(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter three numbers:");
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            do {
                System.out.println(a);
                a -= c;
            } while (a >= b);
        }
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
