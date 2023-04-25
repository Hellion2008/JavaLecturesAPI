package s4;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        t1();
//        t2();
//        t3();
//        t4();
        t5();
    }

    static void t1(){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeStart1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(0,i);
        }
        long timeFinish1 = System.currentTimeMillis();
        System.out.println(timeFinish1 - timeStart1);

        long timeStart2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0,i);
        }
        long timeFinish2 = System.currentTimeMillis();
        System.out.println(timeFinish2 - timeStart2);
    }

    static void t2(){
        //����������� ���������� ����������, �������:
//  ��������� �� ������������ ������ ���� text~num
//  ����� ����������� ������ �� ~, ��������� text � ������� ������ �� ������� num.
//  ���� ������� print~num, ������� ������ �� ������� num � ������� ������ � ������� � �� ������.
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList();
        while(work){
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            String[] splitline = command.split("~");
            switch (splitline[0]){
                case "print":
                    System.out.println(list.remove(Integer.parseInt(splitline[1])));
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    work = false;
                    break;
                default:
                    list.add(Integer.parseInt(splitline[1]), splitline[0]);
            }
        }
    }

    static void t3(){
//��������� �� ������������ � ����������� ������.
//���� ������� print, ������� ������ ���, ����� ��������� ��������� ���� ������ � ������, � ������ - ���������.
//���� ������� revert, ������� ���������� ��������� ������ �� ������.
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList();
        while(work) {
            System.out.println("Enter command: ");
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }
        }
    }

    static  void t4(){
//1) �������� �����, ������� ��������� ������ ���������,
// �������� �� � ���� � ������� �� ������� ���������� �����.
//2) �������� �����, ������� ��������� ������ ���������,
// �������� �� � ������� � ������� �� ������� ���������� �������.
         Stack<Integer> stack = new Stack<>();
         stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        Queue<Integer> queue = new LinkedList<>();
    }

    static void t5(){
//        ����������� ���� � ������� �������.
//                ����� ����������� ������:
//        size(), empty(), push(), peek(), pop().
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(3);
        stack.push(7);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
