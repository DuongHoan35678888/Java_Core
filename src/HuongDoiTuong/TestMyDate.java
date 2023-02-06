package HuongDoiTuong;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(30, 01, 2001);
        MyDate myDate1 = new MyDate(6,2,2023);
        System.out.println("Date = " + myDate.getDay());

        myDate.setDay(35);
        System.out.println("Date = " + myDate.getDay());
        myDate.setDay(20);
        System.out.println("Date = " + myDate.getDay());

        myDate.setMonth(15);
        System.out.println("Month = " + myDate.getMonth());
        myDate.setMonth(10);
        System.out.println("Month = " + myDate.getMonth());

        myDate.setYear(2000);
        System.out.println("Year = " + myDate.getYear());
        myDate.setYear(-5);
        System.out.println("Year = " + myDate.getYear());

        System.out.println(myDate1);

        System.out.println("So sanh mydate voi mydate1: " + myDate.equals(myDate1));
        System.out.println("Hashcode mydate: " + myDate.hashCode());
        System.out.println("Hashcode mydate1: " + myDate1.hashCode());
    }
}
