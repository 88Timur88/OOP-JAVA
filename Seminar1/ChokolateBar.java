package Seminar1;

public class ChokolateBar extends Product {

    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public ChokolateBar(String brand, String name, double price, int calories) {
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format(
                "Шоколадка\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалорийность: %d]",
                brand, name, price, calories);
    }
}
