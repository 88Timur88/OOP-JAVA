package Seminar2;

public class Cat implements Eating {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat() {
    }
    public interface Eating {

        String getName();
        int getAppetite();
        int getFood();
    


    
    }
 

}
