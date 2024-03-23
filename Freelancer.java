/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{
    private Freelancer(String surName, String name, double salary, double hourlyRate) {
        super(surName, name, salary, hourlyRate);
    }

    public static Freelancer create(String surName, String name, double salary, double hourlyRate){
        return new Freelancer(surName, name, salary, hourlyRate);
    }

    @Override
    public double calculateSalary() {
        // среднемесячная заработная плата = 20.8 * 8 * почасовая ставка
        double averageMonthlySalary;
        averageMonthlySalary = 20.8 * 8 * hourlyRate;
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; среднемесячная заработная плата: %.2f руб.",
                surName, name, salary, calculateSalary());
    }
}
