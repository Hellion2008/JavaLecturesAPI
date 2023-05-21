package s6;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        t1();
//        t2();
        t3();
    }

    static void t1(){
        /*
        * Создать HashSet, LinkedHashSet, TreeSet, заполнить каждое множество числами
        * {1,2,3,2,4,5,6,3}. Распечатать содержимое каждого множества
        * */

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();
        Set<Integer> set4 = new TreeSet<>();

        Integer[] arr = {1,2,3,2,4,5,6,3};
        set4.addAll(Arrays.asList(arr));

        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }
        for (int x: set1) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            set2.add(arr[i]);
        }
        for (int x: set2) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            set3.add(arr[i]);
        }
        for (int x: set3) {
            System.out.print(x + " ");
        }
    }

    static void t2(){
/*
* Написать метод, который заполнит массив из 1000 элементов случаными цифрами от 0 до 24.
* Создать метод,  в который передаете заполненный выше массив и с помощью Set вычислить процент
* уникальных знайчений в данном массиве и верните его в виде числа с плавающей запятой
* формула:
* процент уникальных чисел = кол-во уникальных чисел * 100 / общее кол-во чисел в массиве
* */
        Integer[] arr = createArr();
        calculatePercent(arr);
        System.out.println(unic(arr));
    }

    static  void t3(){
        /*
        * Продумайте структуру класса Кот. какие поля и методы будут актуальны для приложения, которое
        * является:
        * 1. Информационной системой вет-клиники
        * 2. архивом выставки котов
        * 3. инфо системой Театра Куклачева
        *
        * Добейтесь того, чтобы при выводе в консоль объекта типа Cat
        * выводились некоторые его поля класса
        * */
        Cat cat1 = new Cat();
        cat1.setName("Pushok");
        System.out.println(cat1.getName());
        Cat cat2 = new Cat("Tiger", 2, "Vasya", "Swed", null);
        System.out.println(cat2.getOwner());
        System.out.println(cat2);
        System.out.println(cat1);
    }

    static Integer[] createArr (){
        int n = 1000;
        Random random = new Random();
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,25);
        }
        return  array;
    }

    static double unic (Integer[] arr){
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(arr));
        double per = set.size() * 100 / arr.length;
        return per;
    }

    static void calculatePercent (Integer[] arr){
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(arr));
        int count = 0;
        for (Integer x: set) {
            for (int j = 0; j < arr.length; j++) {
                if (x == arr[j]) count++;
            }
            double u = count * 100 / arr.length;
            System.out.printf("%d : %.01f\n", x, u);
            count = 0;
        }
    }
}
