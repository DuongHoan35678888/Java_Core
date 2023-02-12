package Mang;

import java.util.Arrays;

public class ViDu {
    public static int[] reverse(int[] x){
        int[] results = new int[x.length];
        int index = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            results[index] = x[i];
            index++;
        }
        return results;
    }
    public static void main(String[] args) {
        int[] a = new int[] {1,4,8,6,5,9,14};
        int[] b = new int[10];

        // Hiển thị ra mảng a lúc ban đầu
        System.out.println("mang a ban dau: " + Arrays.toString(a));

        // Hàm sắp xếp tăng dần
        Arrays.sort(a);
        System.out.println("mang a sau khi sap xep: " + Arrays.toString(a));

        // Hàm tìm kiếm 1 mảng đã sx tăng dần
        System.out.println(Arrays.binarySearch(a,5));
        System.out.println(Arrays.binarySearch(a,-1));

        // Hàm điền giá trị
        Arrays.fill(b, 10);
        System.out.println("mang b sau khi dien gia tri: " + Arrays.toString(b));

        // Hàm sắp xếp giảm dần
        Arrays.sort(a);
        a = ViDu.reverse(a);
        System.out.println("mang a sau khi sap xep giam dan: " + Arrays.toString(a));
    }
}
