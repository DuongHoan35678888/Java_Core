package TinhKeThua;

public class Test {
    public static void main(String[] args) {
        ConNguoi conNguoi = new ConNguoi("Duong Van Hoan", 2001);
        System.out.println("Hanh dong cua con nguoi: ");
        conNguoi.an();
        conNguoi.uong();
        conNguoi.ngu();

        HocSinh hocSinh = new HocSinh("Duong Van Hoan",2001, "KTMT01", "HaUi");
        System.out.println("Hanh dong cua 1 hoc sinh: ");
        hocSinh.an();
        hocSinh.uong();
        hocSinh.ngu();
        hocSinh.lamBaiTap();
    }
}
