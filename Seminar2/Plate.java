package Seminar2;

public class Plate{
    private int food;
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("В миске: " + food + " мг корма");
    }

}
