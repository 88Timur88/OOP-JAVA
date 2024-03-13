package Seminar1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume)
                    return bottleOfWater;
            }
        }
        return null;
    }
    public ChokolateBar getChokolateBar(String name, int calories){
        for (Product product : products){
            if (product instanceof ChokolateBar){
                ChokolateBar chokolateBar = (ChokolateBar)product;
                if (chokolateBar.getName().equals(name) && chokolateBar.getCalories() == calories)
                    return chokolateBar;
            }
        }
        return null;
    }

}
