public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    /**
     * Имя
     */
    protected String name;
    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Ставка заработной платы
     */
    public double salary;
    /**
     * Почасовая ставка
     */
    public double hourlyRate;

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();
    /**
     * Конструкторы
     */
    public Employee(String surName, String name, double salary, double hourlyRate) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.hourlyRate = hourlyRate;
    }
    public Employee(String surName, String name, double salary) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
    }
}
