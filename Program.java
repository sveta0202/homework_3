import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Object[] workers = EmployeeFabric.generateEmployees(15);
        for (Object worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(workers);

        for (Object worker : workers) {
            System.out.println(worker);
        }
    }
}
