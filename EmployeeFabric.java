import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(120001);
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary);
    }
    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(120001);
        int hourlyRate = random.nextInt(2001);
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, hourlyRate);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     * разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Object[] generateEmployees(int count){
        Object[] workers = new Object[count];
        for (int i = 0; i < count; i++){
            int rd = random.nextInt(2);
            if (rd == 1){
                workers[i] = generateWorker();
            }
            else {
                workers[i] = generateFreelancer();
            }
        }
        return workers;
    }
}
