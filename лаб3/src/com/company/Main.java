package com.company;

import java.util.Scanner;
import java.util.regex.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = sc.nextLine();
        String p1 = "[a-z]";
        String p2 = "[A-Z]";
        String p3 = "[0-9]";
        String p4 = "//W";

        Pattern pa1 = Pattern.compile(p1);
        Pattern pa2 = Pattern.compile(p2);
        Pattern pa3 = Pattern.compile(p3);
        Pattern pa4 = Pattern.compile(p4);

        Matcher M = pa1.matcher(password);
        Matcher m = pa2.matcher(password);
        Matcher n = pa3.matcher(password);
        Matcher s = pa4.matcher(password);
        if (password.length() > 7) {
            if (s.find()) {
                System.out.print("Неверные символы");
            } else {
                if (m.find() && M.find() && n.find()) {
                    System.out.print("Пароль корректный");
                } else {
                    System.out.print("Неверный пароль");
                }
            }
        } else {
            System.out.print("Пароль неверный");
        }
    }
}

