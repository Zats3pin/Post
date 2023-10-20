package com.eltex;

import java.security.Provider;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  //      final var post = new Post("Content","author", 0);
 //       System.out.print(post);
        Scanner in = new Scanner(System.in);
        String temp;



        final var service = new WailService();
        System.out.println("Введите свои координаты по широте (lat)");
        temp = in.nextLine();
        service.setCoords(temp,temp);
        System.out.println("ведите свои координаты по долготе (long)");
        temp = in.nextLine();
        System.out.println("Введите имя автора статьи");
        temp = in.nextLine();
        service.setAuthor(temp);
        System.out.println("Введите саму статью");
        temp = in.nextLine();
        service.setContent(temp);
        System.out.println("Оценить свою статью? 0 - да, 1 - нет");
        temp = in.nextLine();

        if (temp.equals("0")) {
            service.like();
        }


        System.out.println(service.getPost()); // Post[content=, author=Anonymous, likes=1]
    }
    }
