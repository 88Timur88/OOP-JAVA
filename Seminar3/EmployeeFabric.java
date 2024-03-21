package Seminar3;

import java.util.*;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(18, 65);
        int salary = random.nextInt(60000, 120001);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)], age,
                salary);
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        double salary = random.nextDouble(300.00, 600.00);
        int age = random.nextInt(18, 65);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)], 
                salary, age);
    }



    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count (количество основных работников)
     * @param countFreekancer (колличество фрилансеров)
     * @return
     */
    public static Employee[] generateEmployees(int count, int countFreelancer){
        Employee[] workers = new Employee[count + countFreelancer];
        for (int i = 0; i < count; i++){
            workers[i] = generateWorker();
        }
        for (int j = count; j < count + countFreelancer; j++) {
            workers[j] = generateFreelancer();
        }
        return workers;
    }



}
