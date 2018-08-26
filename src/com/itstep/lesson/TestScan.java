package com.itstep.lesson;

import java.util.Scanner;

public class TestScan {
    public static void main(String[] args) {


/*     Задание 1.
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println();

        System.out.println("Введите целое число");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();
Способ 1
        if (a == b) {
            System.out.println("равно");
        } else if (a > b)
            System.out.println("Первое число больше");
        else
            System.out.println("Второе число больше");
Способ 2
        System.out.println(a > b ? ("Первое число больше") : b > a ? ("Второе число больше") : ("равно"));
*/

/*Задание 3
Составить программу, которая определит, является ли треугольник с заданными сторонами равносторонним,
равнобедренным или разносторонним.

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Введите стороны треугольника");

        System.out.println("Ввести сторону а:");
        a = scanner.nextInt();
        System.out.println("Введите сторону b;");
        b = scanner.nextInt();
        System.out.println("Введите сторону с:");
        c = scanner.nextInt();

        if (a==b && b==c)
            System.out.println("Равносторонний");
        else if (a==b && c!=a)
            System.out.println("Равнобедренный");
        else if (a!=b && b!=c && a!=c)
            System.out.println("Разносторонний");
*/
/* Задание 4
Три шахматиста играют в шахматы. Известно количество очков, набранных каждым из них.
Составить программу, которая определит, на сколько очков победитель оторвался от самого слабого игрока.
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Введите сумму очков игроков");

        System.out.println("Введите сумму очков игрока а:");
        a = scanner.nextInt();
        System.out.println("Введите сумму очков игрока b;");
        b = scanner.nextInt();
        System.out.println("Введите сумму очков игрока с:");
        c = scanner.nextInt();

        if (a > b && a > c ) {
            if (b < c)
                System.out.println("Игрок а опередил игрока b на  " + (a - b) + " очков");
            else if (c < b)
                System.out.println("Игрок а опередил игрока с на  " + (a - c) + " очков");
            else
                System.out.println("Игрок а опередил игров b и с на  " + (a - c) + " очков");
        }

        if (b > a && b > c ) {
            if (a < c)
                System.out.println("Игрок b опередил игрока a на  " + (b - a) + " очков");
            else if (c < a)
                System.out.println("Игрок b опередил игрока с на  " + (b - c) + " очков");
            else
                System.out.println("Игрок b опередил игров a и с на  " + (b - c) + " очков");
        }
        if (c > b && c > a ) {
            if (a < b)
                System.out.println("Игрок c опередил игрока a на  " + (c - a) + " очков");
            else if (c < b)
                System.out.println("Игрок c опередил игрока b на  " + (c - b) + " очков");
            else
                System.out.println("Игрок c опередил игров a и b на  " + (c - a) + " очков");
        }
        */
/* Задание 5
Составить программу, которая вводит число, обозначающее количество лет,
и выводит для этого числа наименование «год», «года» или «лет». Например, «14 лет», «183 года», «31 год».
 */
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.println("Введите ваш возраст");
        a = scanner.nextInt();
        if (a >= 5 && a <= 20 || (a > 20 && a%10 > 4 || a%10 == 0 )) {
            System.out.println( "Вам " + a + " лет" );
        }
        else if (a%10 == 1){
            System.out.println( "Вам " + a + " год" );
        }
        else
            System.out.println("Вам " + a + " года");
    }
}


