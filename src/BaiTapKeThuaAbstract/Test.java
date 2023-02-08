package BaiTapKeThuaAbstract;

public class Test {
    public static void main(String[] args) {
        HangSanXuat hangSanXuat1 = new HangSanXuat("VietNam Airline", "Viet Nam");
        HangSanXuat hangSanXuat2 = new HangSanXuat("VinFast", "Viet Nam");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Thong Nhat", "Viet Nam");

        MayBay mayBay = new MayBay("May Bay", hangSanXuat1, "Xang");
        PhuongTienDiChuyen oTo = new XeOTo("O To", hangSanXuat2, "Xang");
        PhuongTienDiChuyen xeDap = new XeDap("Xe Dap", hangSanXuat3);

        System.out.println("--------Lay hang san xuat-------------");
        System.out.println("may bay: " + mayBay.layTenHangSanxuat());

        System.out.println("--------Khoi Dong: -------------------");
        oTo.khoiDong();

        System.out.println("--------Lay van toc: -----------------");
        System.out.println("May bay: " + mayBay.layVanToc());
        System.out.println("O To: " + oTo.layVanToc());
        System.out.println("Xe Dap: " + xeDap.layVanToc());

        System.out.println("--------May Bay------------------------");
        mayBay.catCanh();
        mayBay.haCanh();
    }
}
