package Seminar2;
/*
 * ЗАДАНИЕ
1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды 
(например, в миске 10 еды, а кот пытается покушать 15-20).

2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). 
Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, 
то он её просто не трогает, то есть не может быть наполовину сыт 
(это сделано для упрощения логики программы).

3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
 и потом вывести информацию о сытости котов в консоль.

4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

import java.util.Scanner;

public class Programm {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Kokos", 10),
                new Cat("Matros", 7),
                new Cat("Fox", 13),
                new Cat("Boks", 6),
                new Cat("Koks", 5),
                new Cat("Mops", 11),
        };
        System.out.println("Сколько мг корма наложить в миску?");
        Scanner read = new Scanner(System.in);
        int feed = read.nextInt();
        Plate plate = new Plate(feed);
        plate.info();
        for (Cat c : cats) {
            int eat = plate.getFood();
            c.eating(eat);
            if (eat >= c.getAppetite()) {

                plate.setFood(eat - c.getAppetite());
            }
            plate.info();
            if (eat <= c.getAppetite()) {
                System.out.println("В миске мало корма, сколько еще мг корма положить?");
                int doubleFeed = read.nextInt();
                if (doubleFeed > 0) {
                    plate.setFood(eat + doubleFeed);
                    eat = plate.getFood();
                    c.eating(eat);
                } else {
                    c.eating(eat);
                }
            }
        }
    }
}
