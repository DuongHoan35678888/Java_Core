package XuLyChuoi;

import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Nhap vao chuoi: ");
        string = scanner.nextLine();
        System.out.println("----------------------Ham length()-----------------------------");

        // ham length() => Lay ra do dai chuoi
        System.out.println(string.length());
        System.out.println("--------------------Ham charAt()-------------------------------");
        // ham charAT(vi tri) => lay ra 1 ky tu tao vi tri bat ki
        for (int i = 0; i < string.length(); i++) {
            System.out.println("Vi tri " + i + " la: " + string.charAt(i));
        }
        System.out.println("---------------------Ham getChars()-------------------------------");
        // ham getChars(vtri bat dau, vtri ket thuc, mang luu du lieu, vi tri bat dau luu cua mang)
        char[] arrayChar = new char[20];
        string.getChars(0, 5,arrayChar,0);
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println("Gia tri cua mang tai: " + i + " la: " + arrayChar[i]);
        }
        System.out.println("----------------------Ham compareTo()-----------------------------");
        // ham compareTo => so sanh > < =
        String sv1 = "Tran Thi Mai";
        String sv2 = "Nguyen Quynh Chau";
        String sv3 = "Chu Hoa Hoa";
        String sv4 = "Tran Thi Mai";
        System.out.println("sv1 CompareTo sv2: " + sv1.compareTo(sv2));
        System.out.println("sv2 CompareTo sv3: " + sv2.compareTo(sv3));
        System.out.println("sv1 CompareTo sv4: " + sv1.compareTo(sv4));

        // ham compareToIgnoreCase, giong ham compareTo nhung ko phan biet chu hoa chu thuong

        System.out.println("-----------------------Ham regionMatches()------------------------------");
        // ham regionMatches(vi_tri_batdau_r1, r2, vi_tri_bat_dau_r2, so_ki_tu_so_sanh) => so sanh 1 doan
        String r1 = "Viet Nam";
        String r2 = "Nam";
        boolean check = r1.regionMatches(5, r2, 0, 3);
        System.out.println("Ket qua so sanh bang regionMatches: " + check);

        System.out.println("-----------------------Ham startsWith()-------------------------------------------");
        // Ham startsWith() => ham kiem tra chuoi bat dau bang ...
        String sdt = "08662584886";
        System.out.println(sdt.startsWith("0866"));
        System.out.println(sdt.startsWith("0986"));

        System.out.println("-----------------------Ham endWith()----------------------------------------------------");
        // ham endWith() => kiem tra chuoi ket thuc bang...
        String tenFile = "LapTrinhMang.java";
        String tenFile1 = "TrietHoc.pdf";

        if (tenFile.endsWith(".java")) {
            System.out.println("tenFile la file code java");
        }else if (tenFile.endsWith(".pdf")) {
            System.out.println("tenFile la file pdf");
        }

        if (tenFile1.endsWith(".java")) {
            System.out.println("tenFile1 la file code java");
        }else if (tenFile1.endsWith(".pdf")) {
            System.out.println("tenFile1 la file pdf");
        }

        System.out.println("------------------Ham indexOf()-------------------------------------");
        // Ham indexOf() => tim kiem chuoi tu trai sang phai
        String s1 = "Chuc mung nam moi, chuc mung sinh nhat, Chuc mung!";
        String s2 = "Chuc mung";
        String s3 = "na ni";

        System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2));
        System.out.println("Vi tri cua s3 trong s1 la: " + s1.indexOf(s3));

        // su dung vi tri bat dau trong ham indexOf()
        System.out.println("Vi tri cua s2 trong s1 tinh tu vi tri thu 2 la: " + s1.indexOf(s2, 2));

        System.out.println("-------------------Ham lastIndexOf()--------------------------------------------");
        // Ham lastIndexOf() => tim kiem chuoi tu phai sang trai
        System.out.println("Vi tri cua s2 trong s1 (tu phai sang trai) la: " + s1.lastIndexOf(s2));

    }
}
