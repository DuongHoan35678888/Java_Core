package CacLopQuanLyThoiGian;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        // Hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("TEST");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Trước khi chạy for: " + t1);
        System.out.println("Sau khi chạy for: " + t2);
        System.out.println("Thời gian: " + (t2 - t1) + "mls");
        System.out.println("Thoi gian: " + (t2 - t1)/1000 + " s");

        // TimeUnit => chuyển đổi thời gian
        System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000*365) + " s");
        System.out.println("2 gio = " + TimeUnit.HOURS.toSeconds(2) + " s");

        // Date => lấy ra ngày, tháng, năm
        Date date = new java.sql.Date(System.currentTimeMillis());
        System.out.println(date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900));

        // Calendar => ưu tiên sử dụng hơn Date
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));

        c.add(Calendar.HOUR, 30);
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));

        // DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(date));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));

    }
}
