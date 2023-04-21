package s3;

import java.util.*;

public class Program {
    public static void main(String[] args) {
//        t1();
//        t2();
        t3();
    }

    static void t1(){
        /*
        * «аполнить список дес€тью случайными числами.
ќтсортировать список методом sort() и вывести его на экран.
* */
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            list.add((int) (Math.random() * (100 - 10 + 1) + 10));
//        }
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10, 100));
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }

    static void t2(){
        /*—оздать список типа ArrayList
ѕоместить в него как строки, так и целые числа.
ѕройти по списку, найти и удалить целые числа.*/
        List list = new ArrayList();
        list.add(1);
        list.add("Hello");
        list.add(10);
        list.add("hi");
        System.out.println(list);
//        1 вариант
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) instanceof Integer){
//                list.remove(i);
//                i--;
//            }
//        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object ob  = iterator.next();
            if (ob instanceof Integer)
                iterator.remove();
        }
        System.out.println(list);
    }

    static void t3(){
        /* аталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
         что на 0й позиции каждого внутреннего списка содержитс€ название жанра,
         а на остальных позици€х - названи€ книг. Ќапишите метод дл€ заполнени€ данной структуры.*/
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Detective", "Sherlock Holms");
        addBook(shopBook, "Fantastic", "Harry Potter");
        addBook(shopBook, "Horror", "IT");
        addBook(shopBook,"Detective", "Agatha Cristi");
        System.out.println(shopBook);
    }

    static void addBook (List<List<String>> shopBook, String genre, String name){
        for (int i = 0; i < shopBook.size(); i++) {
            if (shopBook.get(i).get(0).equalsIgnoreCase(genre)) {
                List<String> list = shopBook.get(i);
                list.add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(name);
        shopBook.add(list);
    }

}
