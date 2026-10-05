class Date {
    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }


    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {

        Date date = new Date(10, 5, 2026);

 
        System.out.println("Initial date:");
        date.displayDate();

 
        System.out.println("\nUsing getter methods:");
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());

 
        date.setMonth(12);
        date.setDay(25);
        date.setYear(2026);

 
        System.out.println("\nDate after using setter methods:");
        date.displayDate();
    }
}