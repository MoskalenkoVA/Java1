package ru.geekbrains.lesson1;

import com.sun.org.apache.xpath.internal.objects.XBoolean;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MainApp {
// 1 задание
    public static void main(String[] args) {
// 2 задание
        byte a = 3;
        short b = -10;
        int c = 33;
        long d = 22L;
        float f = 35.5f;
        double g = 3.3;
        char ch1 = '%';
        boolean ye = true;
        String text = "This TV";
            System.out.println("Третье задание " + taskTree());
            System.out.println("Четвёртое задание " + task4());
            isPositive();
            System.out.println("Шестое задание " + isNegative());
            greetings();
           }
// 3 задание
    public static float taskTree() {
       float a = 4;
       float b = 4;
       float c = 2;
       float d = 8;
        return a * (b + (c / d));
            }
// 4 задание
    public static boolean task4() {
        int a = (int) Math.random() * 10;
        int b = (int) Math.random() * 10;
        int c = a + b;
        if (c >= 10 && c <= 20)
            return true;
        return false;
    }
// 5 задание
        public static void isPositive() {
        int x = (int) Math.random();
        if(x > 0) {
            System.out.println("В пятом задании Х это положительное число");
        } else {
            System.out.println("В пятом задании Х это отрицательное число");
        }
    }
// 6 задание
     public static boolean isNegative() {
         int x = (int) Math.random();
            if(x < 0) {
                return true;
            }
            return false;
        }
// 7 задание
     public static void greetings() {
         System.out.print("Введите имя: ");
         Scanner in = new Scanner(System.in);
         String name = in.next();
         System.out.println("Привет, " + name);
        }
}