package assign1.ex_1_1;

public class OrientationTask1_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Run " + i);

            ServicePoint point = new ServicePoint();
            CustomerGenerator generator = new CustomerGenerator();

            generator.createCustomers(point, 3);
            point.serve();
        }
    }
}