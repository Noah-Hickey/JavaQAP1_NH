
public class TestDate {
    
    public static void main(String[] args) {

        // Creating a date object //
        Date date = new Date(20, 1, 2025);
        
        // Displaying the date //
        System.out.println(date);
        
        // Changing the date //
        date.setDay(2);
        date.setMonth(2);
        date.setYear(2025);
        
        // Displaying the changed date //
        System.out.println(date);
    }
}
