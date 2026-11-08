package assign1.ex_1_2;

public class OrientationTask2_2 {
    public static void main(String[] args) {
        EventList list = new EventList();

        list.addEvent(new Event(15));
        list.addEvent(new Event(5));
        list.addEvent(new Event(10));

        System.out.println("Removed: " + list.removeEvent());
        System.out.println("Remaining events:");
        list.printEvents();
    }
}