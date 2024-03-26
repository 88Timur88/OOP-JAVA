package Seminar4;

import java.util.ArrayList;



public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    private double totalWeight;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public double getTotalWeight() {
        return totalWeight;
    }
// Метод сравнения веса двух коробок
    public boolean compare(Box anotherBox) {
        if (getTotalWeight() == anotherBox.getTotalWeight()) {
            return true;
        }
        return false;
    }
// Метод пересыпки одной коробки в другую
    public void pourOver(Box<T> anotherBox) {
        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }
}
