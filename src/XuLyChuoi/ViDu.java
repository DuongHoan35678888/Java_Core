package XuLyChuoi;

import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Nhap vao chuoi: ");
        string = scanner.nextLine();
        System.out.println("--------------");

        // ham length() => Lay ra do dai chuoi
        System.out.println(string.length());
        // ham charAT(vi tri) => lay ra 1 ky tu tao vi tri bat ki
        for (int i = 0; i < string.length(); i++) {
            System.out.println("Vi tri " + i + " la: " + string.charAt(i));
        }
        // ham getChars(vtri bat dau, vtri ket thuc, mang luu du lieu, vi tri bat dau luu cua mang)
        char[] arrayChar = new char[20];
        string.getChars(0, 5,arrayChar,0);
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println("Gia tri cua mang tai: " + i + " la: " + arrayChar[i]);
        }
    }
}
