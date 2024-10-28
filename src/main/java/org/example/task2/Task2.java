package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {


    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);

        List<Integer> numbers2 = new ArrayList<>();

        for(int i: numbers1) {
            numbers2.add(i+50);
        }

        for(int i: numbers2) {
            System.out.println(i);
        }
    }
}
