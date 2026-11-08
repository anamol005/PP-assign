package assign1.ex_1_2;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> events = new PriorityQueue<>();

    public void addEvent(Event e) {
        events.add(e);
    }

    public Event removeEvent() {
        return events.poll();
    }

    public void printEvents() {
        PriorityQueue<Event> copy = new PriorityQueue<>(events);

        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}