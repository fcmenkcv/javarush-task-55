package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/*
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        boolean value = console.nextBoolean();
        int x = 0;

        if (value == false) {
            x = (int) Math.floor(glass);
        } else if (value == true) {
            x = (int) Math.ceil(glass);
        }

        System.out.println(x);
    }
}
