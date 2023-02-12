package kieu_DL_enum;

public class EnumTest {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Lap trinh mang");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday, "Lap trinh Java");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday, "Lap trinh Python");
        System.out.println(tkb_t2.toString());
        System.out.println(tkb_t3.toString());
        System.out.println(tkb_t4.toString());

        int x = Thang.thang1.soNgay();
        System.out.println("Số ngày của tháng 1: " + x);
    }
}
