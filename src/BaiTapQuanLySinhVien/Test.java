package BaiTapQuanLySinhVien;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(5, 2, 2000);
        Ngay ngay2 = new Ngay(22, 12, 2003);
        Ngay ngay3 = new Ngay(5, 2, 2000);

        Lop lop1 = new Lop("Ki thuat lap trinh", "Dien Tu");
        Lop lop2 = new Lop("Lap trinh mang", "CNTT");
        Lop lop3 = new Lop("Triet hoc", "Ke toan");

        SinhVien sinhVien1 = new SinhVien("A1222", "Tran Van Dung", ngay1, 4.0, lop1);
        SinhVien sinhVien2 = new SinhVien("B1477", "Nguyen Thi Quynh Anh", ngay2, 10, lop2);
        SinhVien sinhVien3 = new SinhVien("C7894", "Duong Mai Thu", ngay3, 9.2, lop3);

        System.out.println("Ten khoa cua sinh vien 1: " + sinhVien1.layTenKhoa());
        System.out.println("Ten khoa cua sinh vien 2: " + sinhVien2.layTenKhoa());
        System.out.println("Ten khoa cua sinh vien 3: " + sinhVien3.layTenKhoa());

        System.out.println("sinh vien 1 thi dat: " + sinhVien1.kiemTraThiDat());
        System.out.println("sinh vien 2 thi dat: " + sinhVien2.kiemTraThiDat());
        System.out.println("sinh vien 3 thi dat: " + sinhVien3.kiemTraThiDat());

        System.out.println("Kiem tra cung ngay sinh: ");
        System.out.println("sinh vien 1 va sinh vien 2: " + sinhVien1.kiemTraCungNgaySinh(sinhVien2));
        System.out.println("sinh vien 1 va sinh vien 3: " + sinhVien1.kiemTraCungNgaySinh(sinhVien3));

    }
}
