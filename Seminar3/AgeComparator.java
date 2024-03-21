package Seminar3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // return Double.compare(o2.age, o1.age);
        if (o1.age < o2.age) {
            return -1;
        } else if (o1.age == o2.age) {
            return 0;
        } else {
            return 1;
        }

    }
}