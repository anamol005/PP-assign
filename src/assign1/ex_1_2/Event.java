package assign1.ex_1_2;

public class Event implements Comparable<Event> {
    private int time;
    private EventType type;

    public Event(int time) {
        this.time = time;
        this.type = EventType.ARRIVAL;
    }

    public Event(int time, EventType type) {
        this.time = time;
        this.type = type;
    }

    public int compareTo(Event e) {
        if (time == e.time) {
            return 0;
        } else if (time > e.time) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "Event time: " + time + ", type: " + type;
    }
}