package Seminar4;



public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {
        Box <Apple> ap1 = new Box<>();
        ap1.addFruit(new Apple());
        ap1.addFruit(new Apple());
        ap1.addFruit(new Apple());

        Box <Apple> ap2 = new Box<>();
        ap2.addFruit(new Apple());
        ap2.addFruit(new Apple());

        Box <Orange> or1 = new Box<>();
        or1.addFruit(new Orange());
        or1.addFruit(new Orange()); 
        or1.addFruit(new Orange());

        Box <Orange> or2= new Box<>();
        or2.addFruit(new Orange());
        or2.addFruit(new Orange());
        
        
        System.out.println(ap1.compare(or1));

        System.out.println("Вес первой коробки: " + or1.getTotalWeight());
        System.out.println("Вес второй коробки: " + or2.getTotalWeight());
        System.out.println(or2);
        or2.pourOver(or1);
        ap1.pourOver(ap2); 
        ap1.pourOver(ap2);
        System.out.println("Вес первой коробки: " + or1.getTotalWeight());
        System.out.println("Вес второй коробки: " + or2.getTotalWeight());
        System.out.println(or2);
    }

}
