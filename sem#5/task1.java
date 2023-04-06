/*
    Задание 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
    что 1 человек может иметь несколько телефонов.

*/ 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1{
    public static void main(String[] args) {
        // init bookPhone
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        // add new numbers
        addNumber("Ivanov", 123, bookPhone);
        addNumber("Ivanov", 1234, bookPhone);
        addNumber("Petrov", 546585, bookPhone);
        addNumber("Sidorov", 8956477, bookPhone);
        addNumber("Ivanov", 12356233, bookPhone);
        addNumber("Petrov", 787897, bookPhone);
        // write to console
        printRefBook(bookPhone);
    }
    
    // methode to add new number for letter
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // methode for output reference book
    public static void printRefBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}