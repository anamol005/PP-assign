package assign1.ex_1_1;

public class CustomerGenerator {
    public void createCustomers(ServicePoint point, int num) {
        for (int i = 0; i < num; i++) {
            Customer c = new Customer();
            point.addToQueueue(c);
        }
    }
}