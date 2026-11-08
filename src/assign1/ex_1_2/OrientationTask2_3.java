package assign1.ex_1_2;

public class OrientationTask2_3 {
    public static void main(String[] args) {
        EventList list = new EventList();

        list.addEvent(new Event(15, EventType.EXIT));
        list.addEvent(new Event(5, EventType.ARRIVAL));
        list.addEvent(new Event(10, EventType.ARRIVAL));

        System.out.println("Removed: " + list.removeEvent());
        System.out.println("Remaining events:");
        list.printEvents();
    }
}