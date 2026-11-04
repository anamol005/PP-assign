package assign1.ex_1_1;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueueue(Customer a) {
        a.setStartTime(System.currentTimeMillis());
        queue.addFirst(a);
    }

    public Customer removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {
        long total = 0;
        int count = 0;

        while (!queue.isEmpty()) {
            Customer c = removeFromQueueue();
            long sleepTime = (int) (Math.random() * 1000) + 500;

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }

            c.setEndTime(System.currentTimeMillis());
            total = total + sleepTime;
            count++;

            System.out.println("Customer " + c.getId());
            System.out.println("Response time: " + c.getTimeSpent() + " ms");
            System.out.println("Service time: " + sleepTime + " ms");
        }

        if (count > 0) {
            double average = (double) total / count;
            System.out.println("Average service time: " + average + " ms");
        }
    }
}