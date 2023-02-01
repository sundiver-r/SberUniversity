import java.util.GregorianCalendar;
public class TestMyDate {
    public static void main(String[] args) {

        MyDate dateOne = new MyDate();

        dateOne.setDate(561555550000L);
        System.out.println("год: " + dateOne.getYear());
        System.out.println("месяц: " + dateOne.getMonth());
        System.out.println("день: " + dateOne.getDay());

        MyDate dateTwo = new MyDate(34355555133101L);

        System.out.println(dateOne.getDay() + "-" + dateOne.getMonth() + "-" + dateOne.getYear());
        System.out.println(dateTwo.getDay() + "-" + dateTwo.getMonth() + "-" + dateTwo.getYear());


    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        setDate(new GregorianCalendar().getTimeInMillis());
    }

    public MyDate(long timeInMillis) {
        setDate(timeInMillis);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(date.YEAR);
        month = date.get(date.MONTH); 
        day = date.get(date.DAY_OF_MONTH);
    }
}
