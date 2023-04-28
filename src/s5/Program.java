package s5;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        task1();
//        System.out.println(t2("paper", "title"));
//        System.out.println(t3("{a+]}{(d*3)}"));
        String line = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        t4(line);
    }

    static void task1 (){
        /*Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.*/
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("123454", "Васильев");
        passports.add("123455", "Петрова");
        passports.add("123457", "Иванов");
        passports.add("123458", "Петрова");
        passports.add("123459", "Иванов");
        System.out.println(passports.getAll());
        System.out.println(passports.getByLastname("Иванов"));
        System.out.println(passports.print());

    }

    static boolean t2(String s1, String s2){
        /*Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
        если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове,
         при этом повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
         (Например, add - egg изоморфны) буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
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
        /*Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь*/
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
/*Взять набор строк, например,
Мороз и солнце день чудесный
Еще ты дремлешь друг прелестный
Пора красавица проснись.
Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
Слова с одинаковой длиной не должны “потеряться”.*/
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
