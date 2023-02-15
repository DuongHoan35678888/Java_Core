package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSinhVien = new LinkedList<String>();
        danhSachSinhVien.offer("Duong Van Hoan 2");
        danhSachSinhVien.offer("Vinh Tuong");
        danhSachSinhVien.offer("Vinh Phuc");
        danhSachSinhVien.offer("Duong Van Hoan 1");
        while (true) {
            String ten = danhSachSinhVien.poll();   // lay ra va xoa
            // peek => lay ra nhung khong xoa
            if (ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
