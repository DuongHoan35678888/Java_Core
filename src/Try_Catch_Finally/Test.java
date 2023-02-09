package Try_Catch_Finally;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Moi ban nhap a: ");
            a = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Nhap du lieu khong dung.");
        }finally {
            System.out.println("Finally!");
        }
        System.out.println("Gia tri vua nhap la: " + a);
        System.out.println("Successfull!");
    }
}
