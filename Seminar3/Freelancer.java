package Seminar3;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */

public class Freelancer extends Employee {

    private Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, age, salary, salary);
    }

    public static Freelancer create(String surName, String name, double salary, int age) {
        return new Freelancer(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        double res = 20.8 * 8 * salary;
        return res;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер ---> " + "%s %s; возраст: " + age + "; ставка: %.2f руб.; заработная плата: %.2f руб.",
                surName, name, salary, calculateSalary());
    }
}