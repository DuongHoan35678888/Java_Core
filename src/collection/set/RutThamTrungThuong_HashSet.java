package collection.set;

import java.lang.reflect.Array;
import java.util.*;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuDuTHuong = new HashSet<String>();

    public RutThamTrungThuong_HashSet() {
    }
    public boolean themPhieu(String giaTri) {
        return this.thungPhieuDuTHuong.add(giaTri);
    }
    public boolean xoaPhieu(String giaTri) {
        return this.thungPhieuDuTHuong.remove(giaTri);
    }
    public boolean kiemTraPhieuTonTai(String giaTri) {
        return this.thungPhieuDuTHuong.contains(giaTri);
    }
    public void xoaTatCaPhieu() {
        this.thungPhieuDuTHuong.clear();
    }
    public int laysoLuong() {
        return this.thungPhieuDuTHuong.size();
    }
    public String rutThamPhieu() {
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuTHuong.size());
        ketQua = (String) this.thungPhieuDuTHuong.toArray()[viTri];
        return ketQua;
    }
    public void inTatCa() {
        System.out.println(Arrays.toString(this.thungPhieuDuTHuong.toArray()));
    }
    public static void main(String[] args) {
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("MENU:");
            System.out.println("1. Them ma so du thuong.");
            System.out.println("2. Xoa 1 ma so du thuong.");
            System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong.");
            System.out.println("4. Xoa tat ca cac phieu du thuong.");
            System.out.println("5. So luong phieu du thuong.");
            System.out.println("6. Rut tham trung thuong.");
            System.out.println("7. In ra tat ca cac phieu.");
            System.out.println("0. Thoat khoi chuong trinh.");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1 || luaChon == 2 || luaChon == 3 ) {
                System.out.println("Nhap vao ma phieu du thuong: ");
                String giaTri = sc.nextLine();
                if (luaChon == 1) {
                    rt.themPhieu(giaTri);
                }else if (luaChon == 2) {
                    rt.xoaPhieu(giaTri);
                }else {
                    System.out.println("Ket qua kiem tra: " + rt.kiemTraPhieuTonTai(giaTri));
                }
            } else if (luaChon == 4) {
                rt.xoaTatCaPhieu();
            } else if (luaChon == 5) {
                System.out.println("So luong phieu la: " + rt.laysoLuong());
            } else if (luaChon == 6) {
                System.out.println("Ma so trung thuong la: " + rt.rutThamPhieu());
            } else if (luaChon == 7) {
                System.out.println("Cac ma phieu du thuong la: ");
                rt.inTatCa();
            }
        }while (luaChon != 0);
    }

}
