package collection.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSinhVien = new PriorityQueue<String>();
        danhSachSinhVien.offer("Duong Van Hoan 2");
        danhSachSinhVien.offer("Nguyen Van B");
        danhSachSinhVien.offer("Nguyen Van A");
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
