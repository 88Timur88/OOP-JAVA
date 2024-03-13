package Seminar1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("Brand #1", "Name #1", 350);
        System.out.println(product1.displayInfo());

        product1.setPrice(-1400);
        product1.setName("~");
        System.out.println(product1.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        System.out.println(bottleOfMilk2.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(new BottleOfMilk("Brand #4", "Name #5", 310, 0.33, 1));

        Product chokolateBar1 = new ChokolateBar("Brand 1", "Name 1", 1000, 1000);
        System.out.println(chokolateBar1.displayInfo());
        Product chokolateBar2= new ChokolateBar("Brand #2", "Name #2", 2000, 2000);
        System.out.println(chokolateBar2.displayInfo());
        list.add(chokolateBar1);
        list.add(chokolateBar2);
        list.add(new ChokolateBar("Brand #5", "Name #5", 5000, 5000));

        VendingMachine vendingMachine = new VendingMachine(list);
        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Name #2",
        0.5);
        if (bottleOfWaterRes != null){
        System.out.println("Вы купили: ");
        System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
        System.out.println("Такой бутылки с водой нет в автомате.");
        }

        ChokolateBar chokolateBarRes = vendingMachine.getChokolateBar("Name 1", 1000);
        if (chokolateBarRes != null) {
            System.out.println("Вы купили: ");
            System.out.println(chokolateBarRes.displayInfo());
        } else {
            System.out.println("Такого продукта в автомате нет.");
        }

    }

}
