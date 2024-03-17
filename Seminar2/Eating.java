package Seminar2;


public interface Eating {

    String getName();
    int getAppetite();

    default boolean eating(int eat){
        if(eat >= getAppetite()){
            System.out.printf("%s наелся, он съел %d мг корма и отошел в сторону \n", getName(), getAppetite());
            return true;
        } else{
            System.out.printf(eat + " мг корма для %s слишком мало и он, оставшись голодным, не стал кушать ("+ getName() +" хочет съесть " + getAppetite()+" мг корма)\n", getName(), getAppetite());
            return false;
        }


    }
}
