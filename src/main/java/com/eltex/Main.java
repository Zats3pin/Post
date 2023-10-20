package com.eltex;

import java.security.Provider;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  //      final var post = new Post("Content","author", 0);
 //       System.out.print(post);
        Scanner in = new Scanner(System.in);
        String temp;
        double tempDouble = 0;


        final var service = new WailService();
        System.out.println("Введите свои координаты по широте (lat)");
        temp = in.nextLine();
        tempDouble = Double.parseDouble(temp);
        service.setLat(tempDouble);
        System.out.println("Введите свои координаты по долготе (long)");
        temp = in.nextLine();
        tempDouble = Double.parseDouble(temp);
        service.setLong(tempDouble);


        System.out.println("Введите имя автора статьи");
        temp = in.nextLine();
        service.setAuthor(temp);
        System.out.println("Введите саму статью");
        temp = in.nextLine();
        service.setContent(temp);

        System.out.println("Добавить вложение? 0 - да, 1 - нет");
        temp = in.nextLine();
        if (temp.equals("0")) {
            System.out.println("Какой тип вложения добавить? IMAGE - 0, VIDEO - 1, AUDIO - 2");
            temp = in.nextLine();
            if (temp.equals("0")){temp = "IMAGE";service.setType(temp);}
            if (temp.equals("1")){temp = "VIDEO";service.setType(temp);}
            if (temp.equals("2")){temp = "AUDIO";service.setType(temp);}

            System.out.println("Введите ссылку на " + temp);
            temp = in.nextLine();
            service.setUrl(temp);
        }


        System.out.println("Оценить свою статью? 0 - да, 1 - нет");
        temp = in.nextLine();

        if (temp.equals("0")) {
            service.like();
        }


        System.out.println("информация о статье\n" + service.getPost()); // Post[content=, author=Anonymous, likes=1]
    }
    }
