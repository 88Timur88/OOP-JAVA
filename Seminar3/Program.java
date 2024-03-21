package Seminar3;

// Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, 
// освоить работу с интерфейсами Comparator, Comparable.
// 1. Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника. 
// Формула расчета среднемесячной заработной платы может быть такова:
//  «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
// 
// 2. Переработать метод generateEmployees, метод должен создавать случайного сотрудника 
// (Worker, Freelancer или любого другого). Метод должен быть один!
// 
// 3. Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? 
// Тогда добавьте соответствующее состояние на уровне ваших классов).
// 
// 4. Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.


import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] workers = EmployeeFabric.generateEmployees(3, 3);
        for (Employee worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(workers);

        for (Employee worker : workers) {
            System.out.println(worker);
        }
        
        System.out.println();
        System.out.println("***");
        System.out.println();
        
        Arrays.sort(workers, new AgeComparator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }
    }

}
