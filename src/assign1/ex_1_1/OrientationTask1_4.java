package assign1.ex_1_1;

import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("1. Add customer");
            System.out.println("2. Remove customer");
            System.out.println("0. Exit");
            choice = input.nextInt();

            if (choice == 1) {
                Customer c = new Customer();
                c.setStartTime(System.nanoTime());
                queue.addFirst(c);
            } else if (choice == 2) {
                if (queue.isEmpty()) {
                    System.out.println("The queue is empty.");
                } else {
                    Customer c = queue.removeLast();
                    c.setEndTime(System.nanoTime());
                    System.out.println("Customer " + c.getId() + " waited "
                            + c.getTimeSpent() + " ns.");
                }
            }
        }

        input.close();
    }
}