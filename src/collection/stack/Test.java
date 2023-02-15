package collection.stack;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stackChuoi = new Stack<String>();

//        stackChuoi.push("gia tri"); => đưa giá trị vào collection.stack
//        stackChuoi.pop();   => lay gia tri ra, xoa khoi collection.stack
//        stackChuoi.peek();  => lay gia tri ra, nhung ko xoa khoi collection.stack
//        stackChuoi.clear();     // xoa tat ca pha tu trong collection.stack
//        stackChuoi.contains("giatri");  // xac dinh gia tri co ton tai trong collection.stack hay khong
//        stackChuoi.size();  //do lon cua collection.stack

        // vi du dao nguoc chuoi
        System.out.println("Nhap vap chuoi: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("Chuoi dao nguoc: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }

        // vi du chuyen tu he thap phan sang he nhi phan
        Stack<Integer> stackSoDu = new Stack<Integer>();
        System.out.println();
        System.out.println("Nhap 1 so nguyen duong tu ban phim");
        int x = sc.nextInt();
        while (x > 0){
            int soDu = x % 2;
            stackSoDu.push(soDu);
            x = x / 2;
        }
        System.out.println("So nhi phan la: ");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop() + "");
        }
    }
}
