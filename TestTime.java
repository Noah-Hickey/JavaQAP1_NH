public class TestTime {
    public static void main(String[] args) {

        //Create two Time objects //
        Time time1 = new Time(1, 2, 3);
        Time time2 = new Time(22, 5, 6);

        // Display initial times //
        System.out.println("Initial Times:");
        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);

        // Advance time by a second for t1//
        time1.nextSecond();

        //Decrement time by a second for t2//
        time2.previousSecond();

        // Display final times //
        System.out.println("\nFinal Times:");
        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
    }
}
