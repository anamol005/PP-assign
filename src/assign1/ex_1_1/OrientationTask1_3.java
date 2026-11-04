package assign1.ex_1_1;

public class OrientationTask1_3 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setStartTime(10);
        c1.setEndTime(25);

        Customer c2 = new Customer();
        c2.setStartTime(30);
        c2.setEndTime(50);

        System.out.println("Customer " + c1.getId() + " spent " + c1.getTimeSpent());
        System.out.println("Customer " + c2.getId() + " spent " + c2.getTimeSpent());
    }
}