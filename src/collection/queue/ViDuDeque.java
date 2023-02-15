package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSinhVien = new ArrayDeque<String>();

        danhSachSinhVien.offer("mon hoc 1");
        danhSachSinhVien.offer("mon hoc 2");
        danhSachSinhVien.offer("ve hang thu 2");
        danhSachSinhVien.offer("ve hang thu 1");
        danhSachSinhVien.offerFirst("qua tang");
        danhSachSinhVien.offerLast("rat vui duoc gap lai quy khach");

        while (true){
            String ten = danhSachSinhVien.poll();   // lay ra va xoa
            // peek(); lay ra nhung khong xoa
            if (ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
