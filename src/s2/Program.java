package s2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        t1();
//        t2();
        t3();
    }

    static void t1(){
        // Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра.
// Определите индексы первого и последнего её вхождения.
// Sample Input:
// 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
// 4
// Sample Output:
// 0
// 28
        String str = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.print(str.indexOf(n) + ", ");
        System.out.print(str.lastIndexOf(n));
    }

    static void t2(){
        try(Scanner scanner = new Scanner(System.in)) {
            String masha = scanner.nextLine();
            String oleg = scanner.nextLine();
            String words = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
            String[] arr = words.split(" ");
            int count1 = 0, count2 = 0;
            for (String word: arr){
                if (word.contains(masha)) count1++;
                if (word.contains(oleg)) count2++;
            }
            System.out.println(count1);
            System.out.println(count2);
        }
    }

    static void t3(){
        try(Scanner scanner = new Scanner(System.in)){
            String ip = scanner.nextLine();
            boolean isNum = true;
            if(ip.length() <= 15){
                String s = "\\.";
                String[] numbers = ip.split(s);
                if (numbers.length == 4){
                    for (String num: numbers) {
                        if(Integer.parseInt(num) < 0 || Integer.parseInt(num) > 255){
                            isNum = false;
                            break;
                        }
                    }
                }
            }
            if (isNum) System.out.println("yes");
            else System.out.println("no");
        }
    }

    static void t4(){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        String alpha = scanner.nextLine().toLowerCase();
        int count = 0;
        char [] text_out = text.toCharArray();
        for (char symbol: text_out)
        {
            if(symbol==alpha.charAt(0))
                count++;
        }
        System.out.println(count);



    }
}
