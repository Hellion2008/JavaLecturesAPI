package s5;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        task1();
//        System.out.println(t2("paper", "title"));
//        System.out.println(t3("{a+]}{(d*3)}"));
        String line = "����� � ������ ���� ��������\n" +
                "��� �� �������� ���� ����������\n" +
                "���� ��������� ��������.";
        t4(line);
    }

    static void task1 (){
        /*������� ��������� ��� �������� ������� ��������� � ������� ����������� �����������.
123456 ������
321456 ��������
234561 �������
234432 ������
654321 �������
345678 ������
������� ������ �� ����������� � �������� ������.*/
        Passports passports = new Passports();
        passports.add("123456", "������");
        passports.add("123454", "��������");
        passports.add("123455", "�������");
        passports.add("123457", "������");
        passports.add("123458", "�������");
        passports.add("123459", "������");
        System.out.println(passports.getAll());
        System.out.println(passports.getByLastname("������"));
        System.out.println(passports.print());

    }

    static boolean t2(String s1, String s2){
        /*���� 2 ������, �������� �����, ������� ������ true, ���� ��� ������ �������� ����������� � false,
        ���� ���. ������ ���������, ���� ���� ����� � ������ ����� ����� �������� �� ��������� ����� �� ������ �����,
         ��� ���� ������������� ����� ������ ����� �������� �� ���� � �� �� ����� � ����������� ������� ����������.
         (��������, add - egg ���������) ����� ����� �� ��������, � �������� ����� ��. (��������, note - code)
������ 1:
Input: s = "foo", t = "bar"
Output: false
������ 2:
Input: s = "paper", t = "title"
Output: true*/
        if(s1.length() != s2.length())
            return false;
        else {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < c1.length; i++) {
                if (map.containsKey(c1[i])) {
                    if (c2[i] != map.get(c1[i])) {
                        return false;
                    }
                } else {
                    map.put(c1[i], c2[i]);
                }

            }
        }
        return true;
    }

    static boolean t3(String line){
        /*�������� ���������, ������������ ������������ ����������� ������ � ���������.
������ 1: a+(d*3) - ������
������ 2: [a+(1*3) - ����
������ 3: [6+(3*3)] - ������
������ 4: {a}[+]{(d*3)} - ������
������ 5: <{a}+{(d*3)}> - ������
������ 6: {a+]}{(d*3)} - ����*/
        Stack<Character> stack = new Stack<>();
        char[] chars = line.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('<','>');
        map.put('{','}');
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])){
                stack.push(chars[i]);
            }
            if (map.containsValue(chars[i])){
                if (stack.isEmpty() || map.get(stack.pop()) != chars[i]) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static void t4 (String line){
/*����� ����� �����, ��������,
����� � ������ ���� ��������
��� �� �������� ���� ����������
���� ��������� ��������.
�������� �����, ������� ����������� ��� ����� �� ����� � ������� TreeMap.
����� � ���������� ������ �� ������ ������������.*/
        line = line.replace(".", "");
        line = line.replace("\n", " ");
        String[] words = line.split(" ");
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        for(String s: words){
            if (treeMap.containsKey(s.length())){
                treeMap.get(s.length()).add(s);
            } else{
                List<String> list = new ArrayList<>();
                list.add(s);
                treeMap.put(s.length(), list);
            }
        }
        System.out.println(treeMap);
    }
}
