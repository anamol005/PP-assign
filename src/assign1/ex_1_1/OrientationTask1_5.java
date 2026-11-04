package assign1.ex_1_1;

public class OrientationTask1_5 {
    public static void main(String[] args) {
        ServicePoint point = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator();

        generator.createCustomers(point, 3);
        point.serve();
    }
}