package BaiTapQuanLyMayTinh;

public class Test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(6, 2, 2019);
        Ngay ngay2 = new Ngay(14, 5, 2021);
        Ngay ngay3 = new Ngay(1, 2, 2023);

        QuocGia quocGia1 = new QuocGia("Viet Nam", "VN");
        QuocGia quocGia2 = new QuocGia("Hoa Ky", "USA");
        QuocGia quocGia3 = new QuocGia("Ba Lan", "PL");

        HangSanXuat hangSanXuat1 = new HangSanXuat("Acer", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("Macbook", quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("HP", quocGia3);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 5000, 1.5);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 6000, 2);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 7500, 2.5);

        System.out.println("Kiem tra gia ban thap hon: ");
        System.out.println("may tinh 1 va may tinh 2: " + mayTinh1.kiemTraGiaBanThapHon(mayTinh2));
        System.out.println("may tinh 3 va may tinh 1: " + mayTinh3.kiemTraGiaBanThapHon(mayTinh1));

        System.out.println("Lay ten quoc gia: ");
        System.out.println("May tinh 1: " + mayTinh1.layTenQuocGia());
        System.out.println("May tinh 2: " + mayTinh2.layTenQuocGia());
        System.out.println("May tinh 3: " + mayTinh3.layTenQuocGia());
    }
}
